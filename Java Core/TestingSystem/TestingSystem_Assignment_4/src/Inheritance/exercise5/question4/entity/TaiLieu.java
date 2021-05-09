package Inheritance.exercise5.question4.entity;

import java.util.Scanner;

public class TaiLieu {

	private static int counter = 1000;
	private int maTaiLieu;
	private String tenNXB;
	private int soBanPhatHanh;

	public TaiLieu() {

		maTaiLieu = ++counter;
	}

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public int getSoBanPhathanh() {
		return soBanPhatHanh;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ma tai Lieu:" + " "+ maTaiLieu);
		System.out.println("nhap ten nha xuat ban:");
		tenNXB = scanner.nextLine();
		System.out.println("Nhap so ban phat hanh:");
		soBanPhatHanh = scanner.nextInt();

	}

	public void getInfor() {

		System.out.println("ma tai lieu: " + " " +  maTaiLieu);
		System.out.println("ten NXB:" +" " +  tenNXB);
		System.out.println("so ban phat hanh:" +  " " + soBanPhatHanh);
	}

}
