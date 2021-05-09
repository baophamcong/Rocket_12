/**
 * 
 */
package entity;

import java.time.LocalDate;
import java.util.Scanner;

import utils.ScannerUtils;

/**
 * This class is Student 
 * 
 * @Description: .
 * @author: BaoPC
 * @create_date: May 28, 2021
 * @version: 1.0
 * @modifer: BaoPC
 * @modifer_date: May 28, 2021
 */
public class Student implements Comparable<Student> {

	private static int counter = 0;

	private int id;
	private String name;
	private LocalDate birthDay;
	private int score;

	public Student() {
		inputStudent();
		setId(++counter);
	}

	public Student(String name) {
		this.name = name;
		setId(++counter);
	}

	public Student(String name, LocalDate birthDay, int score) {
		this.name = name;
		this.birthDay = birthDay;
		this.score = score;
		setId(++counter);
	}

	private void inputStudent() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên student: ");
		name = ScannerUtils.inputString(scanner, "Please input a name as String...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
