/**
 * 
 */
package com.eudriscabrera.examples.java.valoresconstantes;

/**
 * @author ecabrerar
 * @since Aug 27, 2020
 */
public class ClienteOrden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Orden orden = new Orden("Orden 1", "CREADo", 120.45);
		
		if("CREADO".equals(orden.getEstado())) {
			System.out.println("Esta en estado creado");
		}else {
			System.out.println("Estado no valido!");

		}

	}

}
