/**
 * 
 */
package com.eudriscabrera.examples.java.videoclub;

/**
 * @author eudriscabrera
 *
 */
public class TarifaInfantil implements Tarifa {

	@Override
	public TipoPelicula getTipo() {

		return TipoPelicula.INFANTIL;
	}

	@Override
	public double getImporte(int tiempo) {
		double importe = 60;

		if (tiempo > 3) {
			importe += (tiempo - 3) * 5;
		}
		return importe;
	}

}
