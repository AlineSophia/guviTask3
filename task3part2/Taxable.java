package com.guvi.task3part2;

public interface Taxable {
	
	// Initializing variable
	public final static double salesTax = 7;
	public final static double incomeTax = 10.5;

	// Abstract method
	abstract double calcTax();

}
