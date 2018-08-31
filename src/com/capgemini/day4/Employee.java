package com.capgemini.day4;

public class Employee {
	
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	public final double specialAllowance=250.80;
	public final double HRA=1000.50;
	
	public Employee(long id,String name,String address,long phone) {
		//this();
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		// TODO Auto-generated constructor stub
	}
	public double calculateSalary() {
		double salary;
		salary=(basicSalary+basicSalary*specialAllowance/100)+(basicSalary*HRA/100);
		return salary;
	}
	
	

}
