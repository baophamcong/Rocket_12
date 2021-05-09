import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DatatypeCasting {

	public static void main(String[] args) {
		// Question 1:

		float accounlSalary1 = (float) 5240.5;
		float accounlSalary2 = (float) 10970.055;

		int a1;
		int a2;
		a1 = (int) accounlSalary1;
		a2 = (int) accounlSalary2;
		System.out.println(a1);
		System.out.println(a2);
		// Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số

		int z = ThreadLocalRandom.current().nextInt(10000, 100000);
		System.out.println(z);
		System.out.println("\n");
		// Question 3:Lấy 2 số cuối của số ở Question 2 và in ra.
		String s = String.valueOf(z);
		System.out.println(s.substring(3));

		// Question 4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của
		// chúng

		Scanner scan = new Scanner(System.in);
		System.out.println("nhap so nguyen thu nhat:");
		int a = scan.nextInt();
		System.out.println("nhap so nguyen thu hai:");
		int b = scan.nextInt();

		if (b == 0) {
			System.out.println("vui long nhap lai:");
			int a11 = scan.nextInt();
			System.out.println("nhap so nguyen thu hai:");
			int b1 = scan.nextInt();
			System.out.println("thuong cua chung la: " + (float) a11 / (float) b1);
		}

		else {
			System.out.println("thuong cua chung la: " + (float) a / (float) b);
		}
		
		
		// Default value
		Account accout = new Account();
		Account[] accounts = new Account[5];
		for(int i=0; i<accounts.length;i++) {
			System.out.println("Email" + accout.email+ (i+1));
			System.out.println("fullName" + accout.fullName+ (i+1));
			System.out.println("Username" + accout.userName+ (i+1));
			System.out.println("CreateDate" + accout.createDate+ (i+1));
			accounts[i] = accout;
		}
		
		
		for(Account pt: accounts) {
			
			System.out.println( pt.email);
			System.out.println(pt.fullName);
			System.out.println(pt.fullName);
			System.out.println(pt.createDate);
		}
	}

}
