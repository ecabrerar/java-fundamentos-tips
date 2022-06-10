/**
 * 
 */
package com.eudriscabrera.examples.java.videoclub;

/**
 * @author eudriscabrera
 *
 */
public class TarifaNovedad implements Tarifa{

	@Override
	public TipoPelicula getTipo() {
		return TipoPelicula.NOVEDAD;
	}

	@Override
	public double getImporte(int tiempo) {		
		return tiempo * 80;
	}
	
	public int getPuntos(int tiempo) {
		int puntos = 0;
		
		if (tiempo > 1) {
			puntos++;
		}
		
		return puntos;
	}

}
