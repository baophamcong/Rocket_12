package Inheritance.exercise5.question2.entity;

import java.util.Scanner;

public class KySu extends CanBo {

	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	@Override
	public void inputCanBo() {
		super.inputCanBo();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi nhap nganh dao tao:");
		nganhDaoTao = scanner.nextLine();
	}

	@Override
	public void getInfoCanBo() {
		super.getInfoCanBo();
		System.out.println("Nganh dao tao:" + " " + nganhDaoTao);

	}

}
