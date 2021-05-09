package Inheritance.exercise5.question2.frontend;

import java.util.Scanner;


import Inheritance.exercise5.question2.backend.QLCB;



public class Program {

	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int control;
		do {
			
			System.out.println("1: Thêm mới can bo : cong nhan, ky su, nhan vien.");
			System.out.println("2: Hiện thị thông tin về can bo");
			System.out.println("3:Tìm kiếm can bo theo loại: cong nhan, ky su, nhan vien.");
			System.out.println("4: Xoá can bo theo mã id");
			System.out.println("5: thoat");
			
			System.out.print("Your choice: ");
			control = Integer.parseInt(scan.nextLine());
			switch (control) {
			case 1:

				qlcb.inputCanBo();
				break;
			case 2:
				qlcb.printCanBo();
				break;
			case 3:
				qlcb.findCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
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

