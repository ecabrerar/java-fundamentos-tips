package com.eudriscabrera.examples.java.videoclub;

/**
 * 
 * @author eudriscabrera
 *
 */
public enum TipoPelicula {
	NORMAL(1),INFANTIL(2),NOVEDAD(3), ESTRENO (4);
	private int tipoPelicula;
	
	private TipoPelicula(int tipo) {
		tipoPelicula=tipo;
	}
	
	public int getTipoPelicula() {
		return tipoPelicula;
	}
	
}
