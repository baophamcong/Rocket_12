DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;

DROP TABLE  IF EXISTS Country;
CREATE TABLE Country(
	country_id		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    country_name VARCHAR(255) NOT NULL
);
INSERT INTO Country(country_name)
VALUES				('Viet nam'),
					('trung quoc'),
                    ('hoa ki'),
                    ('Nga');
                    
  DROP TABLE IF EXISTS Location;
  CREATE TABLE Location(
	location_id		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    street_address		 VARCHAR(255) NOT NULL,
    postal_code			 VARCHAR(255) NOT NULL,
    country_id 			TINYINT UNSIGNED  NOT NULL,
	CONSTRAINT FK_Country_Location FOREIGN KEY(country_id) REFERENCES Country(country_id)
  );

INSERT INTO Location(street_address, postal_code, country_id )
VALUES				( 'ha noi',     '10000',       1),
					('Washington',  '20001 ',    	3),
                     ('	Moskva',    '100000', 		4),
                    ('Ivanovo',  	'166000 ',			4),
                    ('Atlanta',		'32501' , 		3),
					( 'ho chi minh', '70000',       1),
                     ('	Liêu Ninh',  '1279', 		2),
                    ( 'hai phong',     '04000',       1),
					( 'hai duong',     '03000',       1),
                    ( 'Gia lai',     '61000',       1),
					( 'Ha nam',     '18000',       1),
                    ( 'hoa binh',     '36000',       1),
					( 'ha noi',     '10000',       1),
					('Honolulu',    '96801', 		3),
                    ('Bac kinh',  	'350',			2),
                    ('Tver',  '170000', 		4);
                    
	DROP TABLE IF EXISTS Employee;
	CREATE TABLE Employee(
	employee_id			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    full_name		VARCHAR(255) NOT NULL,
    email			VARCHAR(255) UNIQUE KEY NOT NULL,
    location_id 	SMALLINT UNSIGNED NOT NULL,
 CONSTRAINT FK_Employee_Location   FOREIGN KEY(location_id) REFERENCES Location(location_id)
);			

INSERT INTO Employee(full_name, email, location_id )
VALUES				( 'hoang bao',     'hoangbao@gmail.com',       1),
					('nguyen van an',  'nguyenvanan@gmail.com',    	3),
                     ('	nguyen van binh',    'nguyenvanbinh@gmail.com', 		4),
                    ('nguyen van tam',  	'nguyenvantam@gmail.com ',			4),
                    ('nguyen thi ha',		'nguyenthiha@gmail.com' , 		3),
					( 'nguyen thi ha3', 'nn03@gmail.com',       1),
                     ('	nguyen thi ha2',  'nguyenthiha2@gmail.com', 		2),
                    ( 'nguyen thi ha1',     'nguyenthiha1@gmail.com',       8),
					( 'pham thi loc',     'phamthiloc@gmail.com',       1),
                    ( 'hoang duc ngu',     'hoangducngu@gmail.com',       1),
					( 'hoang minh bau',     'hoangminhbau@gmail.com',       5),
                    ( 'nguyen hoang hai',     'nguyenhoanghai@gmail.com',       6),
					( 'do trung hieu',     'dotrunghieu@gmail.com',       7),
					('nguyen quang hai',    'nguyenquanghai@gmail.com', 		8),
                    ('doan van hau',  	'doanvanhau@gmail.com',			9),
                    ('nguyen van thanh',  'nguyenvanthanh@gmail.com', 		12);
                    

 -- 2a) Lấy tất cả các nhân viên thuộc Việt nam
 -- c1:  su dung subquery
 
	SELECT e.employee_id,e.full_name
	FROM employee e
	WHERE e.location_id IN ( SELECT l.location_id
	FROM location l
	WHERE l.country_id= (SELECT c.country_id
	FROm country c
	WHERE c.country_name ='Viet nam'));
    
-- 2a) Lấy tất cả các nhân viên thuộc Việt nam
--  su dung join
SELECT c.country_name,e.Full_name
FROM Country c
JOIN Location l ON c.country_id = l.country_id
JOIN employee e ON l.location_id = e.location_id
WHERE c.country_name = 'Viet nam';

-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
-- su dung join
SELECT c.country_name, e.email
FROM Country c
JOIN Location l ON c.country_id = l.country_id
JOIN employee e ON l.location_id = e.location_id
WHERE e.email = 'nn03@gmail.com'; 

-- dung sub query
SELECT country_name 
FROM Country
WHERE country_id = (SELECT country_id 
FROM Location
WHERE location_id = (SELECT location_id 
FROM employee
WHERE email = 'nn03@gmail.com'));

-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.	

SELECT c.country_id, c.country_name, l.location_id, COUNT(e.employee_id) AS amount_employee
FROM Country c
LEFT JOIN Location l ON c.country_id = l. country_id
LEFT JOIN Employee e  ON l.location_id = e.location_id
WHERE e.location_id IS NOT NULL
GROUP BY c.country_id, l.location_id
ORDER BY c.country_id;

-- Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
DROP TRIGGER IF EXISTS check_employee;
DELIMITER $$
	CREATE TRIGGER check_employee
    BEFORE INSERT ON Employee
    FOR EACH ROW
    BEGIN
		
        IF NEW.location_id IN (SELECT location_id 
							  FROM Location 
                              WHERE country_id IN ( SELECT c.country_id
													FROM Country c
													JOIN Location l ON c.country_id = l.country_id
													JOIN Employee e ON l.location_id = e.location_id
													GROUP BY c.country_id
													HAVING COUNT(e.employee_id) >= 10 ) ) THEN
	SIGNAL SQLSTATE '12345' 
	SET MESSAGE_TEXT = 'chỉ cho phép insert mỗi quốc gia có tối đa 10 employee';
    END IF;
    END $$
DELIMITER ;

 INSERT INTO Employee(full_name, email, location_id )
VALUES				( 'hoang bao12',     'hoangbao12@gmail.com',       1);

-- 4. Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở 
-- location đó sẽ có location_id = null

DROP TRIGGER IF EXISTS check_location;
DELIMITER $$
	CREATE TRIGGER check_location
		BEFORE DELETE ON Location
		FOR EACH ROW
		BEGIN
			UPDATE Employee
			SET
				location_id = NULL
			WHERE location_id = OLD.location_id;
		END $$
DELIMITER ;

DELETE 
FROM  location
WHERE location_id = 2;

