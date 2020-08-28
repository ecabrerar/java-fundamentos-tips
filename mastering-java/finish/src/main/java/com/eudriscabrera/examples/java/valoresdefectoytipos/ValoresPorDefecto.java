package com.eudriscabrera.examples.java.valoresdefectoytipos;

/**
 * @author ecabrerar
 * @date Aug 27, 2020
 *
 */
public class ValoresPorDefecto {

	private String tipoString;
	private boolean tipoBuleano;
	private char tipoChar;
	private int tipoInt;
	private Integer tipoInteger;
	private Short tipoShort;	
	private long tipoLong;
	private float tipoFloat;
	private double tipoDouble;
	private byte tipoByte;

	public String getTipoString() {
		return tipoString;
	}

	public void setTipoString(String tipoString) {
		this.tipoString = tipoString;
	}

	public boolean isTipoBuleano() {
		return tipoBuleano;
	}

	public void setTipoBuleano(boolean tipoBuleano) {
		this.tipoBuleano = tipoBuleano;
	}

	public char getTipoChar() {
		return tipoChar;
	}

	public void setTipoChar(char tipoChar) {
		this.tipoChar = tipoChar;
	}
	
	public int getTipoInt() {
		return tipoInt;
	}

	public void setTipoInt(int tipoInt) {
		this.tipoInt = tipoInt;
	}

	public Integer getTipoInteger() {
		return tipoInteger;
	}

	public void setTipoInteger(Integer tipoInteger) {
		this.tipoInteger = tipoInteger;
	}	
	

	public Short getTipoShort() {
		return tipoShort;
	}

	public void setTipoShort(Short tipoShort) {
		this.tipoShort = tipoShort;
	}	


	public long getTipoLong() {
		return tipoLong;
	}

	public void setTipoLong(long tipoLong) {
		this.tipoLong = tipoLong;
	}

	public float getTipoFloat() {
		return tipoFloat;
	}

	public void setTipoFloat(float tipoFloat) {
		this.tipoFloat = tipoFloat;
	}

	public double getTipoDouble() {
		return tipoDouble;
	}

	public void setTipoDouble(double tipoDouble) {
		this.tipoDouble = tipoDouble;
	}
	

	public byte getTipoByte() {
		return tipoByte;
	}

	public void setTipoByte(byte tipoByte) {
		this.tipoByte = tipoByte;
	}
	
	

	@Override
	public String toString() {
		return String.format(
				"ValoresPorDefecto [tipoString=%s, tipoBuleano=%s, tipoChar=%s, tipoInt=%s, tipoInteger=%s, tipoShort=%s, tipoLong=%s, tipoFloat=%s, tipoDouble=%s, tipoByte=%s]",
				tipoString, tipoBuleano, tipoChar, tipoInt, tipoInteger, tipoShort, tipoLong, tipoFloat, tipoDouble,
				tipoByte);
	}

	public static void main(String ...s) {
		
		ValoresPorDefecto defecto = new ValoresPorDefecto();
		
		System.out.println(defecto);
		//Diferenciar los tipos de datos primitivos 
		
		defecto.setTipoInt(100000);
		defecto.setTipoShort((short)100000);
		// Cuál es el resultado si comparamos?
		// 1000
		// 10000
		// 100000
		
		boolean comparacion = defecto.getTipoShort()==defecto.getTipoInt();
		
		System.out.println(" short vs int " + comparacion );

	}
	
}
