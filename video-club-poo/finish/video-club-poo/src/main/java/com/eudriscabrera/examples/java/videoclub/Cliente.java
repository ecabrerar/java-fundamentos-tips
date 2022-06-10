package com.eudriscabrera.examples.java.videoclub;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ecabrerar
 * @since Jun 10, 2022
 */
public class Cliente {
	private String nombre;
	private String telefono;
	private List<Alquiler> alquileres;

	public Cliente() {
		this.alquileres = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void addAquiler(Alquiler alquiler) {
		if (alquileres == null) {
			alquileres = new ArrayList<>();
		}

		alquileres.add(alquiler);
	}

	public String getFactura() {
		StringBuilder sb = new StringBuilder(100);

	for (Alquiler alq : alquileres) {		

			sb.append("Titulo pelicula : ").append(alq.getDvd().getTitulo());
			sb.append("Importe : ").append(alq.getImporte());
			sb.append("\n");

		}

		sb.append(" Total: ").append(getImporteTotal());
		sb.append("\nPuntos :").append(getPuntos());

		return sb.toString();
	}

	public double getImporteTotal() {
		double total = 0;

		for (Alquiler alq : alquileres) {

			total += alq.getImporte();
		}

		return total;

	}

	public int getPuntos() {
		int puntos = 0;

		for (Alquiler alq : alquileres) {
			puntos += alq.getPuntos();
		}

		return puntos;
	}

}
