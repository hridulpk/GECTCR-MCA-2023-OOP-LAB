package com.gectcr.mca2023.s2.oop;

public class Person {
	private String name;
	private String gender;
	private String address;
	private int age;

	public Person(String name, String gender, String address, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
public class Employee extends Person{
	public Employee(String name, String gender, String address, int age) {
		super(name, gender, address, age);
		// TODO Auto-generated constructor stub
	}
	private String Empid;
	private String company_name;
	private String Qualification;
	private int salary;
	
}
public class Teacher extends Employee{
	public Teacher(String name, String gender, String address, int age) {
		super(name, gender, address, age);
		// TODO Auto-generated constructor stub
	}
	private String Subject;
	private String Department;
	private String teacher_id;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
