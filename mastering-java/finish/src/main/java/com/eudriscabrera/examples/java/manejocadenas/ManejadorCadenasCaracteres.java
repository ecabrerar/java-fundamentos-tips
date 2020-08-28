package com.eudriscabrera.examples.java.manejocadenas;

/**
 * @author ecabrerar
 * @date Aug 27, 2020
 *
 */
public class ManejadorCadenasCaracteres {

	public static String contactenar(String valor) {
		return String.format("mi valor %s -%d", valor,100);
	}	
	
	public static String concatenarCadenaGrande(String nombre1, String nombre2, String nombre3) {
		return new StringBuilder(100).append("Hola, ")
				.append("!").append(" Por favor, explica como es eso de las cadenas de caracteres grandes.")
				.append(nombre2).append(" y ").append(nombre3).append(" tienen una duda con eso que tu dijiste.")
				.toString();
	}	
	
	public static void main(String ...s) {
	  String miValor =	ManejadorCadenasCaracteres.contactenar("BaranquillaJUG");
	  
	  System.out.println(miValor);
	  
	  String miCadena =  ManejadorCadenasCaracteres.concatenarCadenaGrande("Eudris", "Juan", "Jose");
	  
	  System.out.println(miCadena);

	}
	
}
