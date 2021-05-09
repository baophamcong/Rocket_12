package Inheritance.exercise5.question2.entity;

import java.util.Scanner;

public class NhanVien extends CanBo {

	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	@Override
	public void inputCanBo() {
		super.inputCanBo();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi nhap nganh dao tao:");
		congViec = scanner.nextLine();
	}

	@Override
	public void getInfoCanBo() {

		super.getInfoCanBo();
		System.out.println("cong viec:" + " " + congViec);
	}
}
