package com.emp.business;

public class NamedEmployee {
	private int emp_id;
	private String emp_name;
	private float salary;

	public NamedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NamedEmployee(int emp_id, String emp_name, float salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
