package com.eudriscabrera.examples.java.sr;

public class PersistManager {

	private StoreDatabase dabatase;
	private StoreInvoiceInFile infile;	
	
	public PersistManager(StoreDatabase dabatase, StoreInvoiceInFile infile) {
		super();
		this.dabatase = dabatase;
		this.infile = infile;
	}
	
	public StoreDatabase getDabatase() {
		return dabatase;
	}
	
	public StoreInvoiceInFile getInfile() {
		return infile;
	}	
	
	
}
