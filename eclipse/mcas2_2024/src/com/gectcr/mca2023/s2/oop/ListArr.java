package com.gectcr.mca2023.s2.oop;
import java.util.*;
public class ListArr {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		System.out.println("Enter the size of the array");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("enter the "+i+" element");
			arr1.add(sc.next());
		}
		ArrayList<String> arr2 = new ArrayList<>();
		System.out.println("Enter the size of the array 2:");
		int size1=sc.nextInt();
		for(int i=0;i<size1;i++) {
			System.out.println("enter the "+i+" element");
			arr2.add(sc.next());
		}
		display(arr1);
		//display(arr2);
		diff(arr1,arr2);
		display(arr1);
		//display(arr2);

	}
	private static void display(ArrayList<String> arr1) {
		Iterator<String> iter=arr1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	static void diff(ArrayList<String> arr1,ArrayList<String> arr2) {
		Iterator<String> iter = arr1.iterator();
		while(iter.hasNext()) {
			String item = iter.next();
			if(arr2.indexOf(item) != -1) {
				arr1.remove(item);
			}
		}
	}

}
