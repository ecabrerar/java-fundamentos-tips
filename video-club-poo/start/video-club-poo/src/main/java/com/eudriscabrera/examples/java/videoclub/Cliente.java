package com.eudriscabrera.examples.java.videoclub;

/**
 * @author ecabrerar
 * @since Jun 10, 2022
 */
public class Cliente {
	 private String nombre;
	    private String telefono;
	    private Alquiler[] alquileres;

	    public Cliente(Alquiler[] alquileres) {
	        this.alquileres = alquileres;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }


	    public Alquiler[] getAlquileres() {
	        return alquileres;
	    }

	    public String getFactura() {
	        StringBuilder sb = new StringBuilder(100);

	        double importe = 0;
	        double total = 0;
	        int puntos = 0;

	        for (Alquiler alq : alquileres) {

	            switch (alq.getDvd().getTipo()) {
	                case 1:
	                    importe += 70;

	                    if (alq.getTiempo() > 2) {
	                        importe += (alq.getTiempo() - 2) * 5;
	                    }

	                    break;
	                case 2:

	                    importe += 60;

	                    if (alq.getTiempo() > 3) {
	                        importe += (alq.getTiempo() - 3) * 5;
	                    }

	                    break;
	                case 3:
	                    importe += alq.getTiempo() * 80;
	                    break;

	                default:
	                    break;
	            }

	            sb.append("Titulo pelicula : ").append(alq.getDvd().getTitulo());
	            sb.append("Importe : ").append(importe);
	            sb.append("\n");

	            if (alq.getDvd().getTipo() == 3) {
	                if (alq.getTiempo() > 1) {
	                    puntos++;
	                }
	            }

	            total += importe;

	        }

	        sb.append(" Total: ").append(total);
	        sb.append("\nPuntos :").append(puntos);

	        return sb.toString();
	    }

}
