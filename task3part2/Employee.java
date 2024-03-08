package com.guvi.task3part2;

public class Employee implements Taxable {
	// Initializing variable
	private int empId;
	private String name;
	private double salary;

	// Parameterized constructor
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// Overridden method to calculate income tax
	@Override
	public double calcTax() {
		// Formula to calculate tax
		double taxRate = salesTax / 100;
		double incomeTax = salary * taxRate;
		System.out.println("The income tax of the employee " + name + " with salary " + salary + " is " + incomeTax);
		return incomeTax;
	}
}
