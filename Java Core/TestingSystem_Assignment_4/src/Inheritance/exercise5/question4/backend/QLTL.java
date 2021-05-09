package Inheritance.exercise5.question4.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Inheritance.exercise5.question4.entity.Bao;
import Inheritance.exercise5.question4.entity.Sach;
import Inheritance.exercise5.question4.entity.TaiLieu;
import Inheritance.exercise5.question4.entity.TapChi;

public class QLTL {

	private List<TaiLieu> taiLieus;
	
	public QLTL() {
		
		taiLieus = new ArrayList<>();
		
	}
	
	public void inputTaiLieu() {
		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap so tai lieu ban muon nhap:");
		n = scanner.nextInt();
		
		int choose;
		TaiLieu taiLieu = new TaiLieu();
		
		for(int i=0; i<n; i++)
		{
			System.out.println("ban Muon nhap tai lieu nao: (1:Sach||2: tapChi||3:Bao)");
			
			
			choose = scanner.nextInt();
			switch (choose) {
			case 1 :
				taiLieu = new Sach();
				
				break;
			case 2 :
				taiLieu = new TapChi();
				
				break;
			case 3 :
				taiLieu = new Bao();
				
				break;
			default:
				System.out.println("Nhap sai:");
				i--;
				break;
			}
			
			taiLieu.input();
			taiLieus.add(taiLieu);
		}
			
	}
	
	public void deleteTaiLieu() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma tai lieu can xoa:");
		int mataiLieu = scanner.nextInt();
		for(TaiLieu taiLieu : taiLieus) {
			if(mataiLieu == taiLieu.getMaTaiLieu()) {
				taiLieus.remove(taiLieu);
			}
		}
		
	}
	public void printTaiLieu() {
		
		for(TaiLieu taiLieu : taiLieus) {
			taiLieu.getInfor();
		}
	}
	
	
	public void findTaiLieu() {
		Scanner scanner = new Scanner(System.in);
		int choose;
		System.out.println("Bạn muốn tìm kiếm theo loại nào? (1:Sách || 2: Tạp chí || 3: Báo)");
		choose = scanner.nextInt();
		
		switch (choose) {
		case 1:
			for (TaiLieu taiLieu : taiLieus) {
				if (taiLieu instanceof Sach) {
					taiLieu.getInfor();
				}
			}
			break;
		case 2:
			for (TaiLieu taiLieu : taiLieus) {
				if (taiLieu instanceof TapChi) {
					taiLieu.getInfor();
				}
			}
			break;
		case 3:
			for (TaiLieu taiLieu : taiLieus) {
				if (taiLieu instanceof Bao) {
					taiLieu.getInfor();
				}
			}
			break;
		default:
			System.out.println("Nhập sai !");
			break;
		}
	}
		
		
}
