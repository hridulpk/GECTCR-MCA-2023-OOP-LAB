package com.gectcr.mca2023.s2.oop;

public class ExeDemo {
	public static boolean authenticate(String password,String username) throws AuthenticationException{
		if(password.length()==0 || username.length()==0) {
			throw new AuthenticationException("invalid username");
		}
		return true;
			
		}
	
}
