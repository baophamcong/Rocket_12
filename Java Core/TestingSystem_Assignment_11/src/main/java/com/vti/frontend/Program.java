package com.vti.frontend;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.vti.backend.controller.AccountController;
import com.vti.entity.Account;
import com.vti.utils.JdbcUtils;

public class Program {

	private static AccountController accountController;

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		accountController = new AccountController();

		int choose;
		do {
			menuAccount();

			choose = Integer.parseInt(scan.nextLine());
			switch (choose) {
			case 1:
				// get list data
				System.out.println("======List account=====");
				getListAccount();
				break;

			case 2:
				// get user by ìd
				System.out.println("=======Get account by id======");
				getAccountByID(Integer.parseInt(scan.nextLine()));
				break;

			case 3:
				// create user
				System.out.println("=========Create account=========");
				createAccount();
				break;

			case 4:
				// update user
				System.out.println("=========Update account=========");
				updateAccount();
				break;

			case 5:
				// delete user
				System.out.println("=========Delete account=========");
				deleteAccount();
				break;

			case 6:
				break;

			default:
				System.out.println("input wrong ! please input again.");
				break;
			}
		} while (choose != 6);
	}

	private static void deleteAccount() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input id: ");
		int id = Integer.parseInt(scan.nextLine());

		accountController.deleteAccount(id);

	}

	private static void updateAccount() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input id: ");
		int id = Integer.parseInt(scan.nextLine());

		System.out.println("Input full name: ");
		String fullName = scan.nextLine();

		accountController.updateAccountByID(id, fullName);
	}

	private static void createAccount() throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.println("Input email: ");
		String email = scan.nextLine();

		System.out.println("Input username: ");
		String username = scan.nextLine();

		System.out.println("Input full name: ");
		String fullName = scan.nextLine();

		accountController.createAccount(email, username, fullName);

	}

	private static void getAccountByID(int parseInt) throws Exception {
		Account account = accountController.getAccountByID(parseInt);
		System.out.println(account.toString());
	}

	private static void getListAccount() throws Exception {
		List<Account> accounts = accountController.getListAccount();
		for (Account account : accounts) {
			System.out.println(account.toString());
		}

	}

	private static void menuAccount() {
		System.out.println("============MENU===========");
		System.out.println("=|1. Get list account    |=");
		System.out.println("=|2. Get account by id   |=");
		System.out.println("=|3. Create account      |=");
		System.out.println("=|4. Update account      |=");
		System.out.println("=|5. Delete account      |=");
		System.out.println("=|6. Exit                |=");
		System.out.println("===========================");
		System.out.println("You choose:                ");
	}
}
