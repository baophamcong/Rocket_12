package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.MyNews;

public class Ex1_Abtraction {

	public static void main(String[] args) {
		MyNews myNews = new MyNews();
		int control;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("******MY NEWS*****");
			System.out.println("1. Insert a news");
			System.out.println("2. View list news");
			System.out.println("3. Average rate");
			System.out.println("4. Exit");
			System.out.print("Your choice: ");
			control = Integer.parseInt(scanner.nextLine());
			switch (control) {

			case 1:
				myNews.insert();
				break;
			case 2:
				myNews.viewListNews();
				break;
			case 3:
				myNews.avgRate();
				break;
			case 4:
				System.out.println("Exit");
				return;

			default:
				System.out.println("Nhap sai! Nhap lai");
				break;
			}
		} while (control <= 4);

	}
}
