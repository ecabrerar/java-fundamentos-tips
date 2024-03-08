package com.eudriscabrera.examples.java.sr;

import com.eudriscabrera.examples.java.Book;
import com.eudriscabrera.examples.java.PriceType;

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

	public Book getBook() {
		return book;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public double getTotal() {
		return total;
	}		

	public double calculateTotal() {
		
		double discount = 0.0;
		
		if(PriceType.REGULAR.equals(book.getType())) {
			   discount = new RegularPrice().discountRate(book.getPrice());
		} else if(PriceType.ON_SALE.equals(book.getType())){
			discount = new OnSalePrice().discountRate(book.getPrice());
		} else if(PriceType.CLEARANCE.equals(book.getType())) {
			this.discountRate = 0.70;
		}		

		double price = (book.getPrice() - discount) * quantity;
		
		return  price * (1+taxRate);
		
	}	
	
	


}
