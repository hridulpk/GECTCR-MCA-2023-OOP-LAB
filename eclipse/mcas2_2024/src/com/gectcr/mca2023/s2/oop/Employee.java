package com.gectcr.mca2023.s2.oop;
import java.util.*;

public class Employee {
	private int empId;
	private String name;
	private int Salary;
	private String address;
	public Employee(int empId,String name,int Salary,String address) {
		this.empId=empId;
		this.name=name;
		this.Salary=Salary;
		this.address=address;
	}
	public String toString() {
		return "Employee"+empId+" "+" "+name+" "+Salary+" "+address;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

	}

}
