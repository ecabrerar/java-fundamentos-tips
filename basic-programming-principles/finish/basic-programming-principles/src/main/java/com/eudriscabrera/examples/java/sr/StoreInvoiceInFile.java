package com.eudriscabrera.examples.java.sr;

public class StoreInvoiceInFile implements PersistInvoice {

	private Invoice invoice;	
	
	public StoreInvoiceInFile(Invoice invoice) {
		super();
		this.invoice = invoice;
	}

	@Override
	public void persist() {
		// TODO Auto-generated method stub
		
	}

}
