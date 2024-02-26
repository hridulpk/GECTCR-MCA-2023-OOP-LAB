package com.gectcr.mca2023.s2.oop;

import java.util.Scanner;
public class Matrix{
	private int row;
	private int col;
	private int arr[][];
	public Matrix(int row,int col){
		this.row=row;
		this.col=col;
		this.arr=new int [row][col];
	}
	public int getAt(int i,int j){
		return arr[i][j];
	}
	public void setAt(int i,int j,int value){
		arr[i][j]=value;
	}
	public String toString(){
		String str="[\n";
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
			str=str+arr[i][j]+" ";
			}
			str=str+"\n";
		}
		str=str+"]";
		return str;
	}
	public void read(){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++){
			System.out.println("enter elements of row "+(i+1));
			for(int j=0;j<col;j++){
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	public void add(Matrix m){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=arr[i][j]+m.getAt(i,j);
			}
		}
	}
	public boolean isSymetric(){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(arr[i][j]!=arr[i][j]){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.of rows");
	int row=sc.nextInt();
	System.out.println("Enter the no.of cols");
	int col=sc.nextInt();
	Matrix m1=new Matrix(row,col);
	Matrix m2=new Matrix(row,col);
	Matrix m3=new Matrix(row,col);
	System.out.println("Enter the first Matrix");
	m1.read();
	System.out.println("Enter the second Matrix");
	m2.read();
	System.out.println("first Matrix:\n"+m1);
	System.out.println("second Matrix:\n"+m2);
	
	
	/*for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			m3.setAt(i,j,m1.getAt(i,j)+m2.getAt(i,j));
		}
	}
	System.out.println("added matrix:\n"+m3);*/
	m1.add(m2);
	System.out.println("added matrix 2:\n"+m1);
	System.out.println("the matrix 1 is symetric:"+m1.isSymetric());
}
}
	
	
	
		
	
