package Inheritance.exercise5.question3;

public abstract class Person {

	private String name;

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + " ";
	}
	
	
}
