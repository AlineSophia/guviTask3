package com.guvi.task3part2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Get the employee information from user
		System.out.println("Get employee information");
		System.out.println("Enter Employee id");
		int empId = s.nextInt();
		System.out.println("Enter Employee name");
		String empName = s.next();
		System.out.println("Enter Employee salary");
		double salary = s.nextDouble();
		Employee emp = new Employee(empId, empName, salary);
		//Calling the method to calculate income tax
		emp.calcTax();

		//Get the product information from user
		System.out.println("Get Product information");
		System.out.println("Enter product id");
		int pId = s.nextInt();
		System.out.println("Enter product price");
		int price = s.nextInt();
		System.out.println("Enter product quantity");
		int quantity = s.nextInt();
		Product prod = new Product(pId, price, quantity);
		//Calling the method to calculate sales tax
		prod.calcTax();
	}

}
