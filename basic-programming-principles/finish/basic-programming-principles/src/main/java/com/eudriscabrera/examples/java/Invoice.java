package com.eudriscabrera.examples.java;

/**
 * 
 * @author ecabrerar
 * @since Mar 8, 2024
 */
public class Invoice {
	private Book book;
	private int quantity;
	private double discountRate;
	private double taxRate;
	private double total;

	public Invoice(Book book, int quantity, double discountRate, double taxRate) {
		super();
		this.book = book;
		this.quantity = quantity;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
		this.total = calculateTotal();
	}
	
	

	


	public double calculateTotal() {

		double price = (book.getPrice() - (book.getPrice() * discountRate)) * quantity;
		
		return  price * (1+taxRate);
		
	}
	
	public void printInvoice() {
		  System.out.println(quantity + "x " + book.getTitle() + " " + book.getPrice() + "$");
          System.out.println("Discount Rate: " + discountRate);
          System.out.println("Tax Rate: " + taxRate);
          System.out.println("Total: " + total);
	}
	
	

}
