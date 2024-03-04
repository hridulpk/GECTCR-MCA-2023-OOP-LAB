package com.gectcr.mca2023.s2.oop;

public class Employeee extends Person{
	private String empid;
	private String company_name;
	private String qualification;
	private int salary;
	public Employeee(String name, String gender, String address, int age, String empid, String company_name,
			String qualification, int salary) {
		super(name, gender, address, age);
		this.empid = empid;
		this.company_name = company_name;
		this.qualification = qualification;
		this.salary = salary;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employeee [empid=" + empid + ", company_name=" + company_name + ", qualification=" + qualification
				+ ", salary=" + salary + "]";
	}
	
	
	
}
