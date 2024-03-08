package com.eudriscabrera.examples.java.sr;

import com.eudriscabrera.examples.java.sr.Invoice;

public class PrintInvoice {

	private Invoice invoice;

	public PrintInvoice(Invoice invoice) {
		super();
		this.invoice = invoice;
	}

	public void printInvoice() {
		System.out.println(
				invoice.getQuantity() + "x " + invoice.getBook().getTitle() + " " + invoice.getBook().getPrice() + "$");
		System.out.println("Discount Rate: " + invoice.getDiscountRate());
		System.out.println("Tax Rate: " + invoice.getTaxRate());
		System.out.println("Total: " + invoice.getTotal());
	}
}
