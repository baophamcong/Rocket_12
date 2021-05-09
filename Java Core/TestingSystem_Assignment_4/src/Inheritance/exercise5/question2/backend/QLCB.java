package Inheritance.exercise5.question2.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Inheritance.exercise5.question2.entity.CanBo;
import Inheritance.exercise5.question2.entity.CongNhan;
import Inheritance.exercise5.question2.entity.KySu;
import Inheritance.exercise5.question2.entity.NhanVien;



public class QLCB {


	private List<CanBo> canBos;
	
	public  QLCB() {
		
		canBos = new ArrayList<>();
		
	}
	
	public void inputCanBo() {
		int n;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap so can bo muon nhap:");
		n = scanner.nextInt();
		
		int choose;
		CanBo canBo = new CanBo();
		
		for(int i=0; i<n; i++)
		{
			System.out.println("ban Muon nhap : (1:Cong Nhan||2: Ky Su||3:Nhan Vien)");
			
			
			choose = scanner.nextInt();
			switch (choose) {
			case 1 :
				canBo = new CongNhan();
				
				break;
			case 2 :
				canBo = new KySu();
				
				break;
			case 3 :
				canBo = new NhanVien();
				
				break;
			default:
				System.out.println("Nhap sai:");
				i--;
				break;
			}
			
			canBo.inputCanBo();
			canBos.add(canBo);
		}
			
	}
	
	public void deleteCanBo() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma can bo can xoa:");
		int id = scanner.nextInt();
		for(CanBo canBo : canBos) {
			if(id == canBo.getId()) {
				canBos.remove(canBo);
			}
		}
		
	}
	public void printCanBo() {
		
		for(CanBo canBo : canBos) {
			canBo.getInfoCanBo();
		}
	}
	
	
	@SuppressWarnings("resource")
	public void findCanBo() {
		Scanner scanner = new Scanner(System.in);
		int choose;
		System.out.println("Bạn muốn tìm kiếm theo loại nào? (1:cong Nhan || 2: Ky Su || 3: Nhan Vien)");
		choose = scanner.nextInt();
		
		switch (choose) {
		case 1:
			for (CanBo canBo : canBos) {
				if (canBo instanceof CongNhan) {
					canBo.getInfoCanBo();
				}
			}
			break;
		case 2:
			for (CanBo canBo : canBos) {
				if (canBo instanceof KySu) {
					canBo.getInfoCanBo();
				}
			}
			break;
		case 3:
			for (CanBo canBo : canBos) {
				if (canBo instanceof NhanVien) {
					canBo.getInfoCanBo();
				}
			}
			break;
		default:
			System.out.println("Nhập sai !");
			break;
		}
	}
		
		
}

