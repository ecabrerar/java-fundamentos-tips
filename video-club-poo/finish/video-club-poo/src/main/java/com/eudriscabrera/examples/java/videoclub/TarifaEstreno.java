/**
 * 
 */
package com.eudriscabrera.examples.java.videoclub;

/**
 * @author eudriscabrera
 *
 */
public class TarifaEstreno implements Tarifa{

	@Override
	public TipoPelicula getTipo() {		
		return TipoPelicula.ESTRENO;
	}

	@Override
	public double getImporte(int tiempo) {		
		return 150 * tiempo;
	}

}
