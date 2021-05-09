
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Input_from_console {

	public static void main(String[] args) {

		// Possition

		Position Position1 = new Position();
		Position1.id = 1;
		Position1.positionName = PositionName.DEV;

		Position Position2 = new Position();
		Position2.id = 2;
		Position2.positionName = PositionName.TEST;

		Position Position3 = new Position();
		Position3.id = 3;
		Position3.positionName = PositionName.PM;
		Position[] positions = { Position1, Position2, Position3 };
		// create group
		Group group1 = new Group();
		group1.id = 1;
		group1.groupName = "Nhom Java Fresher";

		Group group2 = new Group();
		group2.id = 2;
		group2.groupName = "Nhom C# Fresher";

		Group group3 = new Group();
		group3.id = 3;
		group3.groupName = "Nhom PHP Fresher";
		Group[] groups = { group1, group2, group3 };

		// create account

		Account account1 = new Account();
		account1.id = 1;
		account1.email = "baopc@gmail.com";
		account1.userName = "baopc";
		account1.fullName = "pham cong bao";
		account1.position = Position1;
		account1.createDate = new Date(95, 11, 20);
		account1.gender = Gender.MALE;

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "oanhnt@gmail.com";
		account2.userName = "oanhnt";
		account2.fullName = "nguyen thi oanh";
		account2.position = Position2;
		account2.createDate = new Date(93, 10, 01);
		account2.gender = Gender.UNKNOW;

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "thaihv@gmail.com";
		account3.userName = "thaihv";
		account3.fullName = "hoang van thai";
		account3.position = Position1;
		account3.createDate = new Date(91, 0, 12);
		account3.gender = Gender.FEMALE;

		Account[] accounts = { account1, account2, account3 };
		// xet xem account1 thuoc group nao

		GroupAccount groupaccount1 = new GroupAccount();
		groupaccount1.groups = group2;
		groupaccount1.accounts = account1;
		groupaccount1.joinDate = new Date(90, 11, 20);

		GroupAccount groupaccount2 = new GroupAccount();
		groupaccount2.groups = group1;
		groupaccount2.accounts = account1;
		groupaccount2.joinDate = new Date(89, 01, 22);

		GroupAccount[] groupOfAccount1 = { groupaccount2, groupaccount1 };
		account1.groups = groupOfAccount1;

//				number();
//				inputAccount() ;
//				question6();
//				inputDepartment() 
		question8();

	}

	public static void number() {

		// Question 1:
		// Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		Scanner input_number = new Scanner(System.in);
		int[] numbers = { 1, 10, 30 }; /// int [] numbers = new int[3];
		System.out.println("Moi ban nhap vao 3 so nguyen");
		int a1 = input_number.nextInt();
		System.out.println("\nSo nguyen thu 1 la:" + a1);
		int a2 = input_number.nextInt();
		System.out.println("\nSo nguyen thu 2 la:" + a2);
		int a3 = input_number.nextInt();
		System.out.println("\nSo nguyen thu 3 la:" + a3);
		System.out.println("\nDay so vua nhap la: " + a1 + " " + a2 + " " + " " + a3);

	}

//	Question 8:
//		Viết chương trình thực hiện theo flow sau:
//		Bước 1:
//		Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
//		Bước 2:
//		Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//		Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo department
//		Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//		lại" và quay trở lại bước 1

	public static void question8() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao chuc nang muon su dung: ");
		int nhap_so = scanner.nextInt();

		switch (nhap_so) {
		case 1:
			inputAccount();

			break;
		case 2:
			inputDepartment();
			break;
		default:
			System.out.println("Ban chi duoc nhap 1 hoac 2. Moi ban nhap lai!");
			break;
		}
	}

	private static void inputDepartment() {
		Scanner scanner = new Scanner(System.in);

		Department department = new Department();
		System.out.println("Moi ban tao department!");

		System.out.print("id la: ");
		int id = scanner.nextInt();
		department.id = (byte) id;

		scanner.nextLine();
		System.out.print("Ten department la: ");
		String name = scanner.nextLine();
		department.name = name;
		System.out.println("\n");

		System.out.println("Ban da tao thanh cong department!");
		System.out.println("id department: " + id);
		System.out.println("Ten department: " + name);

	}

	private static void inputAccount() {
		Scanner scanner = new Scanner(System.in);

		Account account = new Account();
		System.out.println("Moi ban tao account!");

		System.out.print("id la: ");
		int id = scanner.nextInt();
		account.id = (byte) id;

		System.out.print("Ten account la: ");
		String name = scanner.nextLine();
		account.name = name;
		System.out.println("\n");

		System.out.println("Ban da tao thanh cong account!");
		System.out.println("id account: " + id);
		System.out.println("Ten account: " + name);

	}

}
