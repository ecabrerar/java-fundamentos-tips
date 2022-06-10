package com.eudriscabrera.examples.java.videoclub;

/**
 * @author ecabrerar
 * @since Jun 10, 2022
 */
public class Alquiler {
	private DVD dvd;
    private int tiempo;
    
    public DVD getDvd() {
        return dvd;
    }

    public void setDvd(DVD dvd) {
        this.dvd = dvd;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }  
    
    public double getImporte() {    	
		return dvd.getImporte(tiempo);
	}
    
    public int getPuntos(){    	
    	 return dvd.getPuntos(tiempo);
    }
}
