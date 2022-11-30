package com.fse.inhertancedemo;

public class ClassD {

	public void show() {
		System.out.println("Inside ClassD Show Method");
	}
	
	public static void main(String[] args) {
		ClassA.classB.classC.classD.show();
	}
	
}
