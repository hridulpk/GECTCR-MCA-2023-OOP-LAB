package com.gectcr.mca2023.s2.oop;
import java.util.*;

public class StudentHashmap {
	public static void Get_name(HashMap<Integer, String> student) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rollno:");
		int rollno=sc.nextInt();
		System.out.println("the name of given roll no is");
		System.out.println(student.get(rollno));
	}
	
	public static void Get_rollno(HashMap<Integer, String> student) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.nextLine();
		System.out.println("the rollno of given name is:");
		for(Integer i : student.keySet()) {
			String temp=student.get(i);
			if(temp.equals(name)) {
				System.out.println("roll no:"+i+" ename:"+student.get(i));
			}
		}
	}
	

	public static void main(String[] args) {
		HashMap<Integer, String> student=new HashMap<Integer, String>();
		student.put(1,"abhishek");
		student.put(2,"anand");
		student.put(3,"hridya");
		student.put(4,"lakshmi");
		student.put(5,"dayal");
		student.put(6,"veena");
		student.put(7,"parvathy");
		
		StudentHashmap.Get_name(student);
		StudentHashmap.Get_rollno(student);
		
		
		
	}

}
