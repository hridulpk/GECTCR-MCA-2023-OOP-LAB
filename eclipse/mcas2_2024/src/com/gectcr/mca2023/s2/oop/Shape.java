package com.gectcr.mca2023.s2.oop;

public class Shape {

	public static void main(String[] args) {
		Area a=new Area();
		double c1=a.area(10);
		System.out.println(c1);
		double r1=a.area(5,2);
		System.out.println(r1);
		double t1=a.area(3,4,5);
		System.out.println(t1);
		
	}

}
