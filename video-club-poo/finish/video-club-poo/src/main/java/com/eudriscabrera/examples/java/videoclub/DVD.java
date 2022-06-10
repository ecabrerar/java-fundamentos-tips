package com.eudriscabrera.examples.java.videoclub;

/**
 * @author ecabrerar
 * @since Jun 10, 2022
 */
public class DVD {
	private String titulo;
	private Tarifa tarifa;

	public DVD(String titulo, TipoPelicula tipo) {
		super();
		this.titulo = titulo;
		this.setTipo(tipo);
	}

	public String getTitulo() {
		return titulo;
	}

	public TipoPelicula getTipo() {
		return tarifa.getTipo();
	}

	private void setTipo(TipoPelicula tipo) {
		switch (tipo) {
		case NORMAL:
			tarifa = new TarifaNormal();
			break;

		case INFANTIL:
			tarifa = new TarifaInfantil();
			break;

		case NOVEDAD:
			tarifa = new TarifaNovedad();
			break;
		case ESTRENO:
			tarifa = new TarifaEstreno();
			break;
		default:
			break;
		}
	}

	public double getImporte(int tiempo) {
		return tarifa.getImporte(tiempo);
	}

	public int getPuntos(int tiempo) {
		return tarifa.getPuntos(tiempo);
	}
}
