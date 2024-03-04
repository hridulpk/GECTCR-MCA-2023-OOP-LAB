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
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		

	}

}
