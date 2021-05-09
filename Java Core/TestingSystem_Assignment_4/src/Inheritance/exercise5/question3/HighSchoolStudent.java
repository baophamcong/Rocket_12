package Inheritance.exercise5.question3;

public class HighSchoolStudent extends Student {

	private String clazz;
	private String desiredUniversity;

	public HighSchoolStudent() {
		super();
	}

	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;

	}

	@Override
	public String toString() {
		return super.toString() + "clazz=" + clazz + ", desiredUniversity=" + desiredUniversity + "]";
	}
	
	
}