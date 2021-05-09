package Abstraction.Exercise6.Question23;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee("bao", 6.9);
		employee.displayInfo();

		Manager manager = new Manager("quang", 9.6);
		manager.displayInfo();

		Waiter waiter = new Waiter("hoaang", 2.6);
		waiter.displayInfo();
	}

}
