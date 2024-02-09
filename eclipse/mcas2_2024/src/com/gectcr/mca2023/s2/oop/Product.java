package com.gectcr.mca2023.s2.oop;

public class Product {
	public Product(long price, long pcode, String pname) {
		super();
		this.price = price;
		this.pcode = pcode;
		this.pname = pname;
	}
	private long price;
	private long pcode;
	private String pname;
	@Override
	public String toString() {
		return "Product [price=" + price + ", pcode=" + pcode + ", pname=" + pname + "]";
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getPcode() {
		return pcode;
	}
	public void setPcode(long pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

}
