package Inheritance.exercise5.question4.entity;

import java.time.LocalDate;
import java.util.Scanner;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;
	
	public int getSoPhatHanh() {
		return soPhatHanh;
	}
	public int getThangPhatHanh() {
		return thangPhatHanh;
	}
	
	@Override
	public void input() {
		super.input();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap so phat hanh:");
		soPhatHanh = scanner.nextInt();
		System.out.println("nhap thang phat hanh:");
		thangPhatHanh = scanner.nextInt();
		
	}

	 @Override
	 public void getInfor() {
		 super.getInfor();
		 
		 System.out.println("so phat Hanh" + soPhatHanh);
		 System.out.println("thang phat hanh" + " " +  thangPhatHanh);
		 
	 }
	

}
