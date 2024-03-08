package com.eudriscabrera.examples.java.sr;

import com.eudriscabrera.examples.java.IValidador;

public class TitleNotNull implements IValidador{

	@Override
	public boolean validar(String title) {
		
		return null !=title;
	}

}
