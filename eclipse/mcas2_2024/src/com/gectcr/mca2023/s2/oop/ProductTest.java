package com.gectcr.mca2023.s2.oop;


public class ProductTest {

	public static void main(String[] args) {
		Product1 p1=new Product1(1000,"Apple",125);
		Product1 p2=new Product1(2000,"Orange",150);
		Product1 p3=new Product1(3000,"Dragon fruit",300);
		Product1 Large=Largest(p1,p2,p3);
		System.out.println("Largest "+Large);
		p1.setPrice(500.0);
		System.out.println(p1);
		
		System.out.println("Largest "+Largest(p1,p2,p3));
		
	}
	
	public static Product1 Largest(Product1 p1,Product1 p2,Product1 p3) {
		double p1Price=p1.getPrice();
		double p2Price=p2.getPrice();
		double p3Price=p3.getPrice();
		
		if(p1Price>p2Price) {
			if(p1Price>p3Price) {
				return p1;
			}else {
				return p3;
			}
		}else if(p2Price>p3Price) {
			return p2;
		}else {
			return p3;
		}
	}

}
