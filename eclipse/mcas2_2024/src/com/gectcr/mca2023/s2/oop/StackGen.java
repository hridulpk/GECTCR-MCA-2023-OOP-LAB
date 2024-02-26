package com.gectcr.mca2023.s2.oop;


public class StackGen<T> {
	private int size;
	private int top;
	private T store[];
	public StackGen(int size) {
		this.size=size;
		this.top=-1;
		this.store=(T[])(new Object[10]);
		
	}
	
	public void push(T val) {
		store[++top]=val;
	}
	public T pop() {
		return store[top--];
	}

	public static void main(String[] args) {
		StackGen<Integer> s1=new StackGen<Integer>(10);
		StackGen<String> s2=new StackGen<String>(10);
		s1.push(5);
		s1.push(10);
		s2.push("hello");
		s2.push("world");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
