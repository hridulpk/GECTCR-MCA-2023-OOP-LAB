package com.gectcr.mca2023.s2.oop;
import java.io.*;
import java.util.Scanner;
public class Copyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data;
		FileInputStream in_file=new FileInputStream("/home/student/Desktop/1.txt");
		FileOutputStream out_file=new FileOutputStream("/home/student/Desktop/2.txt");
		int i;
		while((i=in_file.read()) !=-1) {
			out_file.write(i);
			
		}
		System.out.println("Teh elements are successfully copied!!");
		System.out.println("The contents of seconf files are:");
		File content = new File("/home/student/Desktop/2.txt");
		Scanner sc=new Scanner(content);
		while(sc.hasNextLine()) {
			data=sc.nextLine();
			System.out.println(data);
		}
		in_file.close();
		out_file.close();
		sc.close();
	}

}
