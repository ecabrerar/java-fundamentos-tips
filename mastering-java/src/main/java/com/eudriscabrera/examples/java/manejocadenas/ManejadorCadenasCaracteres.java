package com.eudriscabrera.examples.java.manejocadenas;

/**
 * @author ecabrerar
 * @date Aug 27, 2020
 *
 */
public class ManejadorCadenasCaracteres {

	public static String contactenar(String valor) {
		return "mi valor: "+ valor;
	}
	
	//Mejor opcion ??
	
	public static String concatenarCadenaGrande(String nombre1, String nombre2, String nombre3) {
		return "Hola, "+nombre1+"!" + " Por favor, explica como es eso de las cadenas de caracteres grandes."+ nombre2 + " y "+nombre3+" tienen una duda con eso que tu dijiste.";
	}
	
	//Mejor opcion ??
	
	public static void main(String ...s) {
	  String miValor =	ManejadorCadenasCaracteres.contactenar("BaranquillaJUG");
	  
	  System.out.println(miValor);
	  
	  String miCadena =  ManejadorCadenasCaracteres.concatenarCadenaGrande("Eudris", "Juan", "Jose");
	  
	  System.out.println(miCadena);

	}
	
}
