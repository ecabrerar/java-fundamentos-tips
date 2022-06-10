/**
 * 
 */
package com.eudriscabrera.examples.java.videoclub;

/**
 * @author eudriscabrera
 *
 */
public interface Tarifa {
	 TipoPelicula getTipo();
	 double getImporte(int tiempo);
	 default int getPuntos(int tiempo) {
	        return 0;
	 }
}
