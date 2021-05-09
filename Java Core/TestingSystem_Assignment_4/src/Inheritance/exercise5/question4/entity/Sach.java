package Inheritance.exercise5.question4.entity;

import java.util.Scanner;

public class Sach extends TaiLieu {

	private String tenTacGia;
	private int soTrang;

	public String getTenTacGia() {
		return tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap ten tac gia");
		tenTacGia = scanner.nextLine();
		System.out.println("Nhap so Trang:");
		soTrang = scanner.nextInt();

	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("ten tac gia:" + " "+ tenTacGia);
		System.out.println("so trang :" +" " + soTrang);
		
	}
}
