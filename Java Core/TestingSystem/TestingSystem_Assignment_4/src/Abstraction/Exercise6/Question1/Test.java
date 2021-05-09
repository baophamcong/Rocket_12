package Abstraction.Exercise6.Question1;

public class Test {

	public static void main(String[] args) {

		Phone phone = new VietnamesePhone();
		phone.insertContact("bao", "0825294200");
		phone.insertContact("bao1", "0825294200");
	
//		phone.removeContact("bao1");
//		phone.hienThiThongTin();
//		phone.updateContact("bao", "0962282193");
//		phone.searchContact("bao");
		
		phone.updateContact("bao", "0825294201");
	}

}
