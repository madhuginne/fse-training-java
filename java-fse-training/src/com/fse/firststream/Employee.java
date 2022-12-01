package com.fse.firststream;

public class Employee {

	private String employeeId;
	private String employeeName;
	private String department;
	private Integer salary;

	public Employee() {

	}

	public Employee(String employeeId, String employeeName, String department, Integer salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{" + "id=" + employeeId + ", name='" + employeeName + ", department='" + department + '\'' + ", salary="
				+ salary + '}';
	}

}
