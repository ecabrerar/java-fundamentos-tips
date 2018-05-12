/**
 * 
 */
package com.eudriscabrera.examples.java.core.tips.enums;

/**
 * @author ecabrerar
 *
 */
public enum ESTADO {
  CREADO("Creado"), PENDIENTE_APROVACION("Pendiente de Aprobacion"), APROBADO("Aprobado");
	
	private String descripcion;
	
	private ESTADO(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public String getId() {
		return name();
	}
	
	
}
