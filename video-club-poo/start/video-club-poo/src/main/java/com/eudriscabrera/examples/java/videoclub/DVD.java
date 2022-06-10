package com.eudriscabrera.examples.java.videoclub;

/**
 * @author ecabrerar
 * @since Jun 10, 2022
 */
public class DVD {
	private String titulo;
    private int tipo;
   

    public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
        return titulo;
    }

    public int getTipo() {
        return tipo;
    }

}
