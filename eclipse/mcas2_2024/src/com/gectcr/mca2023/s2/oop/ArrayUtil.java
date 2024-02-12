package com.gectcr.mca2023.s2.oop;
import java.util.Scanner;

public class ArrayUtil {

	int size;
	int a[];
	public ArrayUtil(int n) {
			this.size=n;
			this.a=new int[n];
	}
	void EnterArr() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the elements: ");
			for(int i=0;i<size;i++) {
				a[i]=sc.nextInt();
			}
	}
	private void DisplayArr() {
			for(int i=0;i<n;i++) {
				System.out.println(a[i]);
			}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements: ");
		int n=sc.nextInt();
		ArrayUtil obj1=new ArrayUtil(n);
		int value;
		System.out.println("enter the element to be searched: ");
		value=sc.nextInt();
		obj
		
	}

}
