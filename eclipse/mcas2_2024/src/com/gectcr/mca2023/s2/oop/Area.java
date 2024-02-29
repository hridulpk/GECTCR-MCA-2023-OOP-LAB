package com.gectcr.mca2023.s2.oop;
import java.util.*;
import java.lang.*;

public class Area {
	public static double area(double r) {
		return 3.14*r*r;
	}
	public static double area(double l,double b) {
		return l*b;
	}
	public static double area(double a,double b,double c) {
		double s=(a+b+c)/2;
		
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
	}

	public static void main(String[] args) {
		

	}

}
