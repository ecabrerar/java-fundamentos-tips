/**
 * 
 */
package com.eudriscabrera.examples.java.videoclub;

/**
 * @author eudriscabrera
 *
 */
public class TarifaNormal implements Tarifa {

	@Override
	public TipoPelicula getTipo() {
		return TipoPelicula.NORMAL;
	}

	@Override
	public double getImporte(int tiempo) {
		 double importe = 70;

	        if (tiempo > 2) {
	            importe += (tiempo - 2) * 5;
	        }

		return importe;
	}

}
