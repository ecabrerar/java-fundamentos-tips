package com.eudriscabrera.examples.java.genericos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ecabrerar
 * @date Aug 27, 2020
 *
 */
public class TiposRawYGenericos {

	public static void imprimir() {
		List<String> lenguajesJVM = new ArrayList<String>();      
		 lenguajesJVM.add("Java");
		 lenguajesJVM.add("Groovy");
		 lenguajesJVM.add("Scala");
		 lenguajesJVM.add("Kotlin");
    	
		
		 for (int i=0; i < lenguajesJVM.size();i++) {
		       		       
		    String array_element = lenguajesJVM.get(i);
				
			System.out.println(array_element);
		 }		 

	}
	
	public static void main(String...s) {
		TiposRawYGenericos.imprimir();
	}
	
}
