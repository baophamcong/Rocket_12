/**
 * 
 */
package com.vti.entity;

public class Employee extends User {

	 private int projectId;
	 private String ProSkill;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

    public Employee(int id,String fullName, String email, String passWord, Role role, int projectId, String proSkill) {
        super(id,fullName, email, passWord, role);
        this.projectId = projectId;
        this.ProSkill = proSkill;
    }

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProSkill() {
		return ProSkill;
	}

	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Employee [   super.toString()  + \" \" +  projectId=" + projectId + ", ProSkill=" + ProSkill + "]";
	}
	
    
}
