package com.scp.emp.util;

//@Entity
//@Table(name="Info_Emp")
public class EmployeeData {
	
	Product prod;
	//@Id
	//@Column(name="EMP_ID")
	private int id;
	//@Column(name="EMP_NAME")
	String empName;
	//@Column(name="EMP_SALARY")
	int salary;
	//@Column(name="COMPANY_NAME")
	String compnayName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompnayName() {
		return compnayName;
	}
	public void setCompnayName(String compnayName) {
		this.compnayName = compnayName;
	}
	public EmployeeData(int id, String empName, int salary, String compnayName) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.compnayName = compnayName;
	}
	public EmployeeData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
