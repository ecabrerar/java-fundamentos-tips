package com.eudriscabrera.examples.java;

/**
 * @author ecabrerar
 * @date Aug 27, 2020
 *
 */
public class DemoManejadorNulo {

	public static String getValorTransformado(String valor) {
		
		if(valor==null) {
			return null;
		}
		return valor.toUpperCase();
	}
	
	public static void main(String...s) {
		
		String valor = DemoManejadorNulo.getValorTransformado("jug");
		
		if(null!=valor) {
			System.out.println(valor);
		}
	}
}
