package Inheritance.exercise5.question4.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Bao extends TaiLieu {

	private String ngayPhathanh;

	public String getNgayPhatHanh() {
		return ngayPhathanh;
	}

	@Override
	public void input() {
		super.input();
		Scanner scnaner = new Scanner(System.in);
		System.out.println("Ngay phat hanh:");
		ngayPhathanh = scnaner.nextLine();

	}

	@Override

	public void getInfor() {
		super.getInfor();
		System.out.println("ngay phat hanh:" +" " + ngayPhathanh);

	}

}
