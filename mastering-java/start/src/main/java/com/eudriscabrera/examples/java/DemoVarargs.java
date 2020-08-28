package com.eudriscabrera.examples.java;

/**
 * @author ecabrerar
 * @date Aug 27, 2020
 *
 */
public class DemoVarargs {

	public static int sumador(int numero1,int numero2) {
		return numero1 + numero2;
	}
	
	public static void main(String... s) {
			
		System.out.println(DemoVarargs.sumador(10, 20));
		
       //que tal si queremos sumar 3 valores
	   //que tal si queremos sumar 4 valores
	}
}
