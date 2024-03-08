package com.eudriscabrera.examples.java;

public class TitleLengthGreaterFive implements IValidador {

	@Override
	public boolean validar(String title) {		
		return (title != null && title.length() > 5);
	}

}
