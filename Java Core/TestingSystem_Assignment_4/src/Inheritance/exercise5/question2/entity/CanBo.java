package Inheritance.exercise5.question2.entity;

import java.util.Scanner;

public class CanBo {
	private int id;
	private String hoTen;
	private int tuoi;
	private String diaChi;
	private String gioiTinh;

	public CanBo() {

	}

	public int getId() {
		return id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	@SuppressWarnings("resource")
	public void inputCanBo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("moi nhap id:");
		id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("moi nhap ho ten:");
		hoTen = scanner.nextLine();

		System.out.println("Moi nhap tuoi:");
		tuoi = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Moi nhap dia chi:");
		diaChi = scanner.nextLine();

		System.out.println("moi nhap gioi tinh:");
		gioiTinh = scanner.nextLine();

	}

	public void getInfoCanBo() {

		System.out.println("ID:" + " " + id);
		System.out.println("hoten:" + " " + hoTen);
		System.out.println("tuoi:" + " " + tuoi);
		System.out.println("dia chi" + " " + diaChi);
		System.out.println("gioi tinh:" + " " + gioiTinh);

	}
	
	

}
