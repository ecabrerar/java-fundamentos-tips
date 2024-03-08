package com.eudriscabrera.examples.java.sr;

public class StoreDatabase implements PersistInvoice {

	private Invoice invoice;	
	
	
	public StoreDatabase(Invoice invoice) {
		super();
		this.invoice = invoice;
	}

	@Override
	public void persist() {
		// TODO Auto-generated method stub
		
	}

}
