package Inheritance.exercise5.question4.frontend;

import java.util.Scanner;

import Inheritance.exercise5.question4.backend.QLTL;

public class Program {

	public static void main(String[] args) {

		QLTL qltl = new QLTL();
		Scanner scan = new Scanner(System.in);
		int control;
		do {
			
			System.out.println("1: Thêm mới tài liêu: Sách, tạp chí, báo.");
			System.out.println("2: Hiện thị thông tin về tài liệu");
			System.out.println("3:Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
			System.out.println("4: Xoá tài liệu theo mã tài liệu");
			System.out.println("5: thoat");
			
			System.out.print("Your choice: ");
			control = Integer.parseInt(scan.nextLine());
			switch (control) {
			case 1:

				qltl.inputTaiLieu();
				break;
			case 2:
				qltl.printTaiLieu();
				break;
			case 3:
				qltl.findTaiLieu();
				break;
			case 4:
				qltl.deleteTaiLieu();
				break;
			case 5:
				return;
			default:
				System.out.println("Nhập sai ! Nhập lại !");
				break;
			}
		} while (control <= 5);
	}

}
