package com.fse.firststream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FirstStream {

	public static void main(String[] args) {

		Employee employee1 = new Employee("001", "Debashish", "Finance", 320453);
		Employee employee2 = new Employee("002", "Narayana", "Human Resources", 2738234);
		Employee employee3 = new Employee("003", "Tata", "Human Resources", 943653);
		Employee employee4 = new Employee("004", "Mahindra", "Talent Management", 854740);
		Employee employee5 = new Employee("005", "Mark", "Operations", 5874395);
		Employee employee6 = new Employee("006", "Elon Musk", "Banking", 320453);
		Employee employee7 = new Employee("007", "Sundar", "Health Care", 2738234);
		Employee employee8 = new Employee("008", "Satya", "Telicom", 943653);
		Employee employee9 = new Employee("009", "Salil", "Operations", 854740);
		Employee employee10 = new Employee("010", "Ambani", "Operations", 5874395);

		List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6,
				employee7, employee8, employee9, employee10);
		System.out.println("List of Employee Names.... Using Traditional For Loop");
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i).getEmployeeName());
		}
		System.out.println("============================");
		System.out.println("List of Employee Departments.... Using For each");
		for (Employee eachEmployee : employeeList) {
			System.out.println(eachEmployee.getDepartment());
		}
		System.out.println("============================");
		System.out.println("List of Employee Salaries.... Using Stream");
		employeeList.stream().forEach(eachEmployee -> System.out.println(eachEmployee.getSalary()));

		Collections.sort(employeeList, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getEmployeeName().compareTo(e2.getEmployeeName());
			}
		});
		System.out.println("============================");
		System.out.println("List of Employees.... Sorted on EmployeeName using Compartor");
		for (Employee eachEmployee : employeeList) {
			System.out.println(eachEmployee);
		}

		System.out.println("============================");
		System.out.println("Iterator to iterate in forward direction.");
		Iterator<Employee> employeeIterator = employeeList.iterator();
		while (employeeIterator.hasNext())
			System.out.println(employeeIterator.next() + " ");
		System.out.println("============================");
		System.out.println("List Iterator to iterate in forward direction.");
		ListIterator<Employee> employeeListIterator = employeeList.listIterator();
		while (employeeListIterator.hasNext())
			System.out.println(employeeListIterator.next() + " ");
		System.out.println("============================");
		System.out.println("List Iterator to iterate in backward direction.");
		while (employeeListIterator.hasPrevious())
			System.out.println(employeeListIterator.previous() + " ");
		System.out.println("============================");
		System.out.println("Stream map method to show all the employee name in uppercase.");
		employeeList.stream().map(eachEmployee -> eachEmployee.getEmployeeName().toUpperCase())
				.forEach(eachEmployee -> System.out.println(eachEmployee));
		System.out.println("============================");
		System.out.println("Stream to calculate average salary.");
		System.out.println(employeeList.stream().mapToDouble(eachEmployee -> eachEmployee.getSalary()).average());
		System.out.println("============================");
		System.out.println("Stream sort() method of stream class to sort the employees.");
		employeeList.stream().sorted(Comparator.comparing(Employee::getDepartment))
				.forEach(eachEmployee -> System.out.println(eachEmployee));
	}

}
