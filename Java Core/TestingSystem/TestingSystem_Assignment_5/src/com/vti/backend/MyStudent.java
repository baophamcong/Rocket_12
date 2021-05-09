package com.vti.backend;

import com.vti.entity.Student;

public class MyStudent {
	Student[] student = new Student[10];

	public void insertStudent() {
		student[0] = new Student(1, "ha", 1);
		student[1] = new Student(2, "hoa", 2);
		student[2] = new Student(3, "bau", 3);
		student[3] = new Student(4, "bao", 1);
		student[4] = new Student(5, "huy", 2);
		student[5] = new Student(6, "nhat", 3);
		student[6] = new Student(7, "toan", 1);
		student[7] = new Student(8, "ha", 2);
		student[8] = new Student(9, "hau", 3);
		student[9] = new Student(10, "hai", 1);
	}

	public void caLopDiemDanh() {
		for (Student std : student) {
			std.diemDanh();
		}
	}

	public void goiHocBai() {
		for (Student std : student) {
			if (std.getGroup() == 1) {
				std.hocBai();
			}
		}
	}

	public void goiDonVeSinh() {
		for (Student std : student) {
			if (std.getGroup() == 2) {
				std.donVeSinh();
			}
		}
	}
}
