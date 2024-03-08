package com.eudriscabrera.examples.java.sr;

public class OnSalePrice implements BookDiscountRate {

	@Override
	public double discountRate(double price) {		
		return price * 0.10;
	}

}
