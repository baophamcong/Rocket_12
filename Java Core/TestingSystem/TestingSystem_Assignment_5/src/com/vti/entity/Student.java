package com.vti.entity;

public class Student implements IStudent {
	private int id;
	private String name;
	private int group;
	
	

	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
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


	public int getGroup() {
		return group;
	}


	public void setGroup(int group) {
		this.group = group;
	}


	@Override
	public void diemDanh() {
		System.out.println(name+" diem danh");

	}

	@Override
	public void hocBai() {
		System.out.println(name+" hoc bai");

	}

	@Override
	public void donVeSinh() {
		System.out.println(name+" don ve sinh");

	}

}
