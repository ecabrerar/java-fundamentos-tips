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
		List lenguajesJVM = new ArrayList();      
		 lenguajesJVM.add("Java");
		 lenguajesJVM.add("Groovy");
		 lenguajesJVM.add("Scala");
		 lenguajesJVM.add("Kotlin");
		
		 for (int i=0; i < lenguajesJVM.size();i++) {
		       System.out.println(lenguajesJVM.get(i));
		 }
	}
	
	public static void main(String...s) {
		TiposRawYGenericos.imprimir();
	}
	
}
