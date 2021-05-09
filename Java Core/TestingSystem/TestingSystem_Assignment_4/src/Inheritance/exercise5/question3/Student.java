package Inheritance.exercise5.question3;

public class Student extends Person{

	private int id;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id) {
		super(name);
		this.id = id;
	}

	@Override
	public String toString() {
		return  super.toString() + "id=" + id + " ";
	}


	
}
