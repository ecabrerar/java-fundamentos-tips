package com.eudriscabrera.examples.java.videoclub;

/**
 * 
 * @author ecabrerar
 * @since Jun 10, 2022
 */
public class VideoClubApp {

	public void ejecutar() {

		DVD dvd = new DVD("La Mascara",TipoPelicula.NORMAL);
	

		DVD dvd1 = new DVD("Kunfu Panda 3",TipoPelicula.NOVEDAD);

		Alquiler alq1 = new Alquiler();
		alq1.setDvd(dvd);
		alq1.setTiempo(5);

		Alquiler alq2 = new Alquiler();
		alq2.setDvd(dvd1);
		alq2.setTiempo(2);
		
		Cliente cliente = new Cliente();
		cliente.setNombre(" Juan Perez");
		cliente.setTelefono("809-555-5555");
		
		cliente.addAquiler(alq1);
		cliente.addAquiler(alq2);

		System.out.println(cliente.getFactura());

	}

	public static void main(String[] args) {
		System.out.println("Video Club App!");
		VideoClubApp vcApp = new VideoClubApp();
		vcApp.ejecutar();
	}

}
