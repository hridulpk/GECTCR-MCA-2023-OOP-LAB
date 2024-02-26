package com.gectcr.mca2023.s2.oop;

public class Product1 implements Comparable<Product> {
	private long pcode;
	private String pname;
	private double price;
	
	Product1(long pcode,String name,double price){
		this.price=price;
		this.pname=name;
		this.pcode=pcode;
	}
	public int compareTo(Product p) {
		return (int)price -(int)p.getPrice();
		
	}
	
	public String toString() {
		return "Product [name:"+ pname + " code:" + pcode + " price:" +price+"]"; 
	}
	public double getPrice() {return price;}
	public void setPrice(double cost) {
		price=cost;
		
	}

}
