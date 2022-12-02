package com.fse.loggerdemo;

public class LoggerDemo {

	public static void main(String[] args) {
		try {
			UserAuthentication authentication = new UserAuthentication();
			authentication.loginUser("Jon", "");
			System.out.println("User has logged in successfully");
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
