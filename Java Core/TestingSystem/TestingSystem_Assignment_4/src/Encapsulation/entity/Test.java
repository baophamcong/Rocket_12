package Encapsulation.entity;

public class Test {

	public static void main(String[] args) {

		Student student1 = new Student("anh", "ha noi");
		student1.setScore(8);

		Student student2 = new Student("bao", "hai	 duong");
		student2.setScore(10);

		Student student3 = new Student("hoang", "ha	 no	i	");
		student3.setScore(4);

		student3.plusScore(3);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}
}
