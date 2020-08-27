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

	@Override
	public String toString() {
		return String.format(
				"ValoresPorDefecto [tipoString=%s, tipoBuleano=%s, tipoChar=%s, tipoInt=%d, tipoInteger=%d]",
				tipoString, tipoBuleano, tipoChar, tipoInt, tipoInteger);
	}

	public static void main(String ...s) {
		
		ValoresPorDefecto defecto = new ValoresPorDefecto();
		
		System.out.println(defecto);
		//Diferenciar los tipos de datos primitivos 
	}
	
}
