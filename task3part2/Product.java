package com.guvi.task3part2;

public class Product implements Taxable {
	// Initializing variable
	private int pid;
	private int price;
	private int quantity;
	private double tax = 7;

	// Parameterized constructor
	public Product(int pid, int price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	// Overridden method to calculate sales tax
	@Override
	public double calcTax() {
		// Formula to calculate tax
		double totalPrice = price * quantity;
		double taxRate = tax / 100;
		double salesTax = totalPrice * taxRate;
		System.out.println("The sales tax for the product " + pid + " with price " + price + " is " + salesTax);
		return salesTax;
	}

}
