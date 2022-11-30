package com.fse.examonconsole;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Question question1 = new Question("01", "Which one of the following is not a java key word?", "this", "String",
				"char", "list", 4);
		Question question2 = new Question("02", "Which one of the following is not valid variable declaraion in java?",
				"myName", "declare_Type", "1Week", "list_variables", 3);
		Question question3 = new Question("03",
				"Which key word in java is used for throwing a specific exception inside a method?", "throw", "throws",
				"Throw", "Throws", 1);
		Question question4 = new Question("04", "What do you mean by chained exceptions in Java?",
				"Exceptions occurred by the VirtualMachineError", "An exception caused by other exceptions",
				"Exceptions occur in chains with discarding the debugging information", "None of the above", 2);
		Question question5 = new Question("05", "Which environment variable is used to set the java path?", "JAVA_HOME",
				"JAVA", "Java", "J2EE_HOME", 1);
		Question question6 = new Question("1", "What is the extension of compiled java classes?", ".jv", ".java",
				".jcf", ".class", 4);
		Question question7 = new Question("1", "Which of the following is a superclass of every class in Java?", "Object Class", "String Class",
				"Java Class", "Java Lang Class", 1);
		Question question8 = new Question("1", "Which one of the following is not an access modifier?", "private", "protected",
				"public", "volatile", 4);
		Question question9 = new Question("1", "JDK stands for ____.", "Java Deployable Kit", "Java Development Kit",
				"Java Developers Kit", "None of these", 2);
		Question question10 = new Question("1", "What is a map in Java?", "Data structure", "Defined in java.util package",
				"Represented using key-value pairs", "All of the above", 4);

		Question[] questionArray = { question1, question2, question3, question4, question5, question6, question7,
				question8, question9, question10 };

		System.out.println("Welcome to Exam On Console");
		System.out.println("Are you ready (Y-Proceed,N-Stop)");
		@SuppressWarnings("resource")
		Scanner scaninput = new Scanner(System.in);
		String readyDecision = scaninput.next();
		if (readyDecision.equalsIgnoreCase("N")) {
			System.out.println("User not ready for test - Program Terminates");
			return;
		}
		for (Question eachquestion : questionArray) {
			System.out.println(eachquestion.toString());
			int userAnswer = scaninput.nextInt();
			if (userAnswer != eachquestion.getCorrectOption()) {
				System.out.println("Your answer is not correct. Do you want to try again? (Y-Yes,N-No)");
				String repeatQuestionCheck = scaninput.next();
				if (repeatQuestionCheck.equalsIgnoreCase("Y")) {
					int user2ndAnswer = scaninput.nextInt();
					if (user2ndAnswer != eachquestion.getCorrectOption()) {
						System.out.println("Your answer is not correct again");
						System.out.println("====Next Question=======");
					} else {
						System.out.println("====Next Question=======");
					}
				} else {
					System.out.println("====Next Question=======");
				}
			} else {
				System.out.println("====Next Question=======");
			}
		}

	}

}
