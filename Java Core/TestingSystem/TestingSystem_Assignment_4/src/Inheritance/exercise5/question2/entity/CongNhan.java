package Inheritance.exercise5.question2.entity;

import java.util.Scanner;

public class CongNhan extends CanBo {

	private short bac;

	public short getBac() {
		return bac;
	}

	@SuppressWarnings("resource")
	@Override
	public void inputCanBo() {
		Scanner scanner = new Scanner(System.in);
		
		super.inputCanBo();
		
		System.out.println("Moi nhap bac luong:");
		bac = scanner.nextShort();

	}

	@Override
	public void getInfoCanBo() {

		super.getInfoCanBo();
		System.out.println(" Bac Luong" + " " + bac);
	}

}
