package com.vti.frontend;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.backend.controller.UserController;
import com.vti.entity.Message;
import com.vti.entity.Relationship;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

public class Program {

	private static UserController userController;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		userController = new UserController();

		int choose;
		do {
			menuAccount();

			choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:

				System.out.println("====== Hien Thi Danh Sach Ban Be Cua Nguoi Dung Hien Tai( 1:Accepted, 0: Pending, 2:Declined, 3:Blocked) =====");
				getListFriend();
				break;

			case 2:

				System.out.println("=======Hien Thi DS 10 Nguoi NT Voi Nguoi Dung Hien Tai( 1:Accepted, 0: Pending, 2:Declined, 3:Blocked)======");
				getList10Friend();
				break;

			case 3:

				System.out.println("=========Hien Thi Tin Nhan Cua 1 Ban Cua Nguoi Dung Hien Tai( 1:Accepted, 0: Pending, 2:Declined, 3:Blocked)=========");
				getMessage();
				break;

			case 4:
				System.out.println("========= Hien Thi CHo Mot Nguoi Ban Bat Ky=========");
				break;

			case 5:

				System.out.println("=========Ket Ban Voi Mot Nguoi Ban( 1:Accepted, 0: Pending, 2:Declined, 3:Blocked) =========");
				createUser();
				getListAllFriend();
				break;
			case 6:

				System.out.println("========= Dong Y Ket Ban( 1:Accepted, 0: Pending, 2:Declined, 3:Blocked) =========");
				updateUser();
				getListAllFriend();
				break;

			case 7:
				break;

			default:
				System.out.println("input wrong ! please input again.");
				break;
			}
		} while (choose != 7);
	}

	private static void getMessage() {
		List<Message> messages = userController.getMessage();

		for (Message message : messages) {
			System.out.println(message.toString());

		}
	}

	private static void getList10Friend() {

		List<User> users = userController.getList10Friend();

		for (User user : users) {
			System.out.println(user.toString());

		}
	}

	private static void getListAllFriend() {

		List<Relationship> relationships = userController.getListAllFriend();

		for (Relationship user : relationships) {
			System.out.println(user.toString());

		}
	}

	private static void updateUser() {

		userController.updateUser();
	}

	private static void createUser() {

		userController.createUser();
	}

	private static void getListFriend() {
		List<User> users = userController.getListFriend();

		for (User user : users) {
			System.out.println(user.toString());

		}

	}

	private static void menuAccount() {
		System.out.println("============MENU===========");
		System.out.println("=|1. Hien Thi Danh Sach Ban Be Cua Nguoi Dung Hien Tai |=");
		System.out.println("=|2. Hien Thi DS 10 Nguoi NT Voi Nguoi Dung Hien Tai  |=");
		System.out.println("=|3. Hien Thi Tin Nhan Cua 1 Ban Cua Nguoi Dung Hien Tai      |=");
		System.out.println("=|4. Hien Thi CHo Mot Nguoi Ban Bat Ky     |=");
		System.out.println("=|5.Ket Ban Voi Mot Nguoi Ban      |=");
		System.out.println("=|6. Dong Y Ket Ban              |=");
		System.out.println("=|7. Exit                |=");
		System.out.println("===========================");
		System.out.println("You choose:                ");
	}

}
