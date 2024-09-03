package com.entity;

public class Employee {
	private int emdid;
	private String name;
	private String role;
	private int salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emdid, String name, String role, int salary) {
		super();
		this.emdid = emdid;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public int getEmdid() {
		return emdid;
	}

	public void setEmdid(int emdid) {
		this.emdid = emdid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emdid=" + emdid + ", name=" + name + ", role=" + role
				+ ", salary=" + salary + "]";
	}

}
