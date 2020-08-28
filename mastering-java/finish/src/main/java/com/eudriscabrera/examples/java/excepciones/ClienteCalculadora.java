package com.eudriscabrera.examples.java.excepciones;

/**
 * @author ecabrerar
 * @since Aug 27, 2020
 */
public class ClienteCalculadora {

	
	public static void main(String...s)  {
		Calculadora calc = new Calculadora();
		int total = calc.sumar(10, null);
		
		System.out.println(total);
	}
	
}
