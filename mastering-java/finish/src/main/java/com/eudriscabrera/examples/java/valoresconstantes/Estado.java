
package com.eudriscabrera.examples.java.valoresconstantes;

/**
 * @author ecabrerar
 * @since Aug 27, 2020
 */
public enum Estado {
 CREADO("Creado"), PENDIENTE_APROVACION("Pendiente de Aprobacion"), APROBADO("Aprobado");
    
    private String descripcion;
    
    private Estado(String descripcion) {
      this.descripcion = descripcion;
    }

    public String getDescripcion() {
      return descripcion;
    }
    
    public String getId() {
        return name();
    }    

}
