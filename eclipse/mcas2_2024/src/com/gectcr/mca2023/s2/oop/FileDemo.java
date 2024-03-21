package com.gectcr.mca2023.s2.oop;
import java.io.File;
import java.util.*;

public class FileDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file path");
		String dir=sc.next();
		System.out.println("enter the filename");
		String filename=sc.next();
		File mydir=new File(dir);
		if(mydir.exists())
		{
			String[] list=mydir.list();
			System.out.println("\n Item are");
			for(String i:list)
			{
				System.out.println("\n"+i);
			}
			int flag=0;
			for(String i:list)
			{
				if(i.equals(filename))
				{
					//System.out.println("\n\n File found");
					flag=1;
					break;
				}
			}
			if(flag == 1) {
				System.out.println("/n File found");
			}
			else
			{
				System.out.println("/n File not found");
			}
		}
		else
		{
			System.out.println("Directory does not exits");
		}

	}

}
