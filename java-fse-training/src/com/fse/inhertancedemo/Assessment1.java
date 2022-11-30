package com.fse.inhertancedemo;

public class Assessment1 {

	class ClassA {
		static ClassB classB;
	}

	class ClassB {
		ClassC classC = new ClassC();
	}

	class ClassC {
		ClassD classD = new ClassD();
	}

	class ClassD {

		public void show() {
			System.out.println("Inside ClassD Show Method");
		}

		public static void main(String[] args) {
			ClassA.classB.classC.classD.show();
		}

	}
}
