
package com.vti.frontend;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.vti.backend.controller.UserController;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;
import com.vti.utils.Validator;

public class Program {

	private static UserController userController;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		userController = new UserController();

		int choose;
		do {
			menuAccount();

			choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:

				System.out.println("=======1 - In all User ======");
				getListUser();
				break;

			case 2:

				System.out
						.println("=======2 - in ra tất cả các employee & Manager trong project theo IDproject ======");
				getEmployeeManagerByIDProject(1);
				break;

			case 3:

				System.out.println("=========3 - In all Manager của các Project =========");
				getListManagerOfProject();
				break;

			case 4:
				System.out.println("=========4 - login =========");

				System.out.println("Enter your email: ");
				String email = scan.nextLine();
				System.out.println("Enter your passsword: ");
				String password = scan.nextLine();
				if (!Validator.isValidatorEmail(email)) {
					System.out.println("Email ko dung dinh dang");
				} else if (!Validator.isValidatorPasssword(password)) {
					System.out.println("password khong dung dinh dang");
				} else
					login(email, password);
				break;

			case 5:

				System.out.println("=========5 - Exit =========");

				return;

			default:
				System.out.println("Input wrong! Please input 1->4 again! ");
				break;
			}
		} while (choose != 5);
	}

	public static void getListManagerOfProject() throws SQLException, ClassNotFoundException {

		List<User> users = userController.getListManagerOfProject();
		for (User user : users) {
			System.out.println(user.toString());
		}

	}

	public static void getEmployeeManagerByIDProject(int id) throws Exception {
		while (true) {

			if (userController.isProjectExists(id)) {
				List<User> users = userController.getEmployeeManagerByIDProject(id);
				for (User user : users) {
					System.out.println(user.toString());
				}
				break;
			} else {
				System.out.println("ID input is not exists! Please input again! ");
			}
		}

	}

	public static void getListUser() throws SQLException, ClassNotFoundException {

		List<User> users = userController.getListUser();

		for (User user : users) {

			System.out.println(user.toString());
		}

	}

	private static void login(String email, String password) throws SQLException {

		if (checkLogin(email, password)) {
			userController.login(email, password);
			System.out.println("Login success!!");
			return;
		} else
			System.out.println("email or password is not correct Moi nhap lai!!");

	}

	private static boolean checkLogin(String email, String password) {

		return userController.checkLogin(email, password);
	}

	private static void menuAccount() {
		System.out.println("============MENU===========");
		System.out.println("=|1 - In all User |=");
		System.out.println("=|2 - in ra tất cả các employee & Manager trong project theo IDproject|=");
		System.out.println("=|3 - In all Manager của các Project    |=");
		System.out.println("=4 - login  |=");
		System.out.println("=5 - Exit  |=");

		System.out.println("===========================");
		System.out.println("You choose:                ");
	}

}
