package Abstraction.Exercise6.Question23;

public abstract class User {

	private String name;
	protected double salaryRatio;

	public User(String name, double salaryRatio) {
		this.name = name;
		this.salaryRatio = salaryRatio;
	}

	public abstract double calculatePay();

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Salary ratio: " + salaryRatio);
		System.out.println("Pay: " + calculatePay());

	}

}
