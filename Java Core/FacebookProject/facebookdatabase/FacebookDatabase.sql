DROP DATABASE IF EXISTS FacebookMessenger;
CREATE DATABASE FacebookMessenger;
USE FacebookMessenger;

DROP TABLE  IF EXISTS  `users`;

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(256) NOT NULL,
  `email` VARCHAR(256) NOT NULL,
  `password` VARCHAR(256) NOT NULL,
  PRIMARY KEY(`user_id`)
) ;


CREATE TABLE IF NOT EXISTS `relationship` (
  `user_one_id` INT(10) UNSIGNED NOT NULL  ,
  `user_two_id` INT(10) UNSIGNED NOT NULL  ,
  `status` TINYINT(3) UNSIGNED NOT NULL DEFAULT '0', -- 1:Accepted: da dc chap nhan, 0: Pending:cho xu ly, 2:Declined:tu choi, 3:Blocked:bi chan
  `action_user_id` INT(10) UNSIGNED NOT NULL,
  FOREIGN KEY( `user_one_id`) REFERENCES `users`( `user_id`)
) ;

INSERT INTO `users` (`user_id`, `username`, `email`, `password`) VALUES
(1, 'user1', 'user1@gmail.com', "12"),
(2, 'user2', 'user2@gmail.com', "123"),
(3, 'user3', 'user3@gmail.com', "1234"),
(4, 'user4', 'user4@gmail.com', "12345"),
(5, 'user5', 'user5@gmail.com', "123456"),
(6, 'user6', 'user2@gmail.com', "123"),
(7, 'user7', 'user3@gmail.com', "1234"),
(8, 'user8', 'user4@gmail.com', "12345"),
(9, 'user9', 'user5@gmail.com', "123456"),
(10, 'user10', 'user2@gmail.com', "123"),
(11, 'user11', 'user3@gmail.com', "1234"),
(12, 'user12', 'user4@gmail.com', "12345"),
(13, 'user13', 'user5@gmail.com', "123456"),
(14, 'user14', 'user6@gmail.com', "1234567");

INSERT INTO `relationship` (`user_one_id`, `user_two_id`, `status`, `action_user_id`) VALUES
(1, 2, 1, 1),
(1, 3, 1, 1),
(1, 4, 1, 1),
(1, 5, 0, 1),
(1, 6, 3, 1),
(2, 3, 1, 2),
(2, 4, 1, 2),
(3, 5, 1, 3),
(3,	6, 2, 3),
(1, 7, 0, 1);

-- điều quan trọng nhất cần nhớ khi sử dụng mô hình này là đảm bảo rằng user_one_id luôn nhỏ hơn user_two_id cho bất kỳ hoạt động nào.

CREATE TABLE IF NOT EXISTS `message` (
  `message_id` INT(10) UNSIGNED NOT NULL ,
  `sendingtime` DATETIME DEFAULT NOW(),
  `senderid` INT(10) UNSIGNED NOT NULL,
  `receiverid` INT(10) UNSIGNED NOT NULL,
  `content` VARCHAR(256) NOT NULL,
  FOREIGN KEY( `message_id`) REFERENCES `users`( `user_id`)
) ;

INSERT INTO `message`(`message_id` , `sendingtime`, `senderid`, `receiverid`,`content` )
VALUES (1,"2020-03-07",1,3,"hi"),
		(1,"2020-03-08",1,2,"hiii"),
        (2,"2020-03-07",2,3,"hiiii"),
        (1,"2020-03-07",3,4,"hi"),
		(1,"2020-03-08",1,3,"hiii"),
        (2,"2020-03-07",2,5,"hiiii"),
        (2,"2020-03-07",2,3,"hiiii"),
        (1,"2020-03-07",3,4,"hi"),
		(1,"2020-03-08",1,3,"hiii"),
        (2,"2020-03-07",2,5,"hiiii"),
        (1,"2020-03-07",3,6,"hi"),
        (1,"2020-03-07",3,6,"hi"),
		(1,"2020-03-08",3,7,"hiii"),
        (2,"2020-03-07",2,3,"hiiii"),
        (1,"2020-03-07",1,3,"hiiii");

  
  SELECT * FROM  `users` `u`
  WHERE `u`.`user_id` IN
  (SELECT `r`.`user_two_id` FROM `relationship` `r`
  WHERE `r`.`user_one_id` = 1  AND  `r`.`status` = 1);
  
 
  SELECT `u`.`user_id`,`u`.`username`, `u`.`email`, `u`.`password`
  FROM  `users` `u`
 JOIN `message` `m` ON `u`.`user_id` = `m`.`message_id`
  ORDER BY `m`.`sendingtime` 
  LIMIT 10;

SELECT *
FROM `message`
WHERE `senderid` = 1 OR `receiverid`=1;
