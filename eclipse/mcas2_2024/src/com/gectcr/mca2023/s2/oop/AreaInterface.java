package com.gectcr.mca2023.s2.oop;

interface Area1{
		public double area();
		public double perimeter();
}
class Circle implements Area1{
	
	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	private double radius;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*314*radius;
	}
}

class Rectangle implements Area1{
	public double length;
	public double breadth;
	public double getLength() {
		return length;
	}
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}
}
public class AreaInterface {		
	public static void main(String[] args) {
		Circle c= new Circle(10);
		Rectangle r= new Rectangle(5,10);
		double area=c.area();
		double per=c.perimeter();
		System.out.println("area of circle:"+area);
		System.out.println("perimeter of circle:"+per);
		System.out.println("area of rectangle:"+r.area());
		System.out.println("perimeter of rectangle:"+r.perimeter());
		
		

	}

}
