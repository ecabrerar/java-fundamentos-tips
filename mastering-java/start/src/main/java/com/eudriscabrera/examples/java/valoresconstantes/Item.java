/**
 * 
 */
package com.eudriscabrera.examples.java.valoresconstantes;

/**
 * @author ecabrerar
 * @since Aug 27, 2020
 */
public class Item {

	private String id;
	private int cantidad;
	private double precio;
	private String nombre;
	
	public Item(String id, int cantidad, double precio, String nombre) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.precio = precio;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
