package com.eudriscabrera.examples.java.valoresconstantes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ecabrerar
 * @since Aug 27, 2020
 */
public class Orden {
	private String descripcion;
	private String estado;
	private Double total;

	private List<Item> items = new ArrayList<>();

	public Orden(String descripcion, String estado, Double total) {
		super();
		this.descripcion = descripcion;
		this.estado = estado;
		this.total = total;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public Double getTotal() {
		return total;
	}

	public List<Item> getItems() {
		return items;
	}

}
