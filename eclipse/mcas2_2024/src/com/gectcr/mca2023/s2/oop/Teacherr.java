package com.gectcr.mca2023.s2.oop;

public class Teacherr extends Employeee{
	private String subject;
	private String department;
	private String teacher_id;
	
	
	
	public Teacherr(String name, String gender, String address, int age, String empid, String company_name,
			String qualification, int salary, String subject, String department, String teacher_id) {
		super(name, gender, address, age, empid, company_name, qualification, salary);
		this.subject = subject;
		this.department = department;
		this.teacher_id = teacher_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	@Override
	public String toString() {
		return "Teacherr [subject=" + subject + ", department=" + department + ", teacher_id=" + teacher_id + "]";
	}
}
