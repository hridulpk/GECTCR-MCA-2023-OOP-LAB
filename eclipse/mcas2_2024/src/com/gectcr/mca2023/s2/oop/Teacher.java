package com.gectcr.mca2023.s2.oop;
import java.util.*;

public class Teacher extends Employee {
	private String department;
	private String subject;
	public Teacher(int empId,String name,int Salary,String address,String department,String subject) {
		super(empId,name,Salary,address);
		this.department=department;
		this.subject=subject;
	}
	/*public String to toString() {
		return "Teacher:"+super.toString()+" "+department+" "+subject;
	}*/
	

}
