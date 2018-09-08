package com.eudriscabrera.examples.java.core.tips.excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author ecabrerar
 * @date Sep 7, 2018
 */
public class PruebaExcepcion {
	
	public void excepcion1() throws ExcepcionJdbcMySQL {
    	throw new ExcepcionJdbcMySQL("Hubo un error");
    }
    
    public void demo() {
    	throw new IllegalArgumentException(" Parametro no valido");
    }

	public static void main(String[] args){
		
		try {
			
			PruebaExcepcion p = new PruebaExcepcion();
			
			p.excepcion1();
			
			p.demo();
		}catch(Exception ex) {
			Logger.getLogger("Demo").log(Level.WARNING, String.format("Ocurrió un error :%s", ex.getMessage()));
		}

	}

}
