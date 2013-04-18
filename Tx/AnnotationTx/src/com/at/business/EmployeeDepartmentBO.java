package com.at.business;

public class EmployeeDepartmentBO {
	private int empId;
	private int deptId;

	public EmployeeDepartmentBO() {
		super();
	}

	public EmployeeDepartmentBO(int empId, int deptId) {
		super();
		this.empId = empId;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
