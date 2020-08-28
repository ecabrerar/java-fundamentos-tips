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
		Orden orden = new Orden("Orden 1", Estado.CREADO, 120.45);
		
		if(Estado.CREADO.equals(orden.getEstado())) {
			System.out.println("Esta en estado creado");
		}else {
			System.out.println("Estado no valido!");
		}
		
		//Obtener todos los valores de un Enum
		for (Estado estado : Estado.values()) {
			System.out.println(estado.getDescripcion());
		}

	}

}
