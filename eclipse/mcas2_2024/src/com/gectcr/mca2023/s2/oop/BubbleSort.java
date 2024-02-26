	package com.gectcr.mca2023.s2.oop;
	import java.util.*;
	
	public class BubbleSort <T>{
		public static <T extends Comparable<T>> void sort(T store[]) {
			int i,j;
			int size=store.length;
			for(i=0;i<size-1;i++) {
				for(j=i+1;j<size;j++) {
					if(store[i].compareTo(store[j])>0) {
						T temp=store[i];
						store[i]=store[j];
						store[j]=temp;
					}
				}
			}
			for(i=0;i<size;i++) {
				System.out.println(store[i]);
			}
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n,i;
			System.out.println("enter the size");
			n=sc.nextInt();
			Integer arr[]= new Integer [n];
			String arr1[]=new String [n];
			System.out.println("enter the elements:");
			for(i=0;i<n;i++) {
				arr[i]=sc.nextInt();

			}

			sort(arr);

			

		}



	}