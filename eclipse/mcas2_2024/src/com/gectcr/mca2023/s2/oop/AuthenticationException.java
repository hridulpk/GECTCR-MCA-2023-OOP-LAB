package com.gectcr.mca2023.s2.oop;

public class AuthenticationException extends Throwable{
	private String msg;

	public AuthenticationException(String msg) {
		this.msg=msg;
	}

	public String getMsg() {
		return msg;
	}
}
