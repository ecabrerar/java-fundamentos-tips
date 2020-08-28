package com.eudriscabrera.examples.java.excepciones;

/**
 * @author ecabrerar
 * @since Aug 27, 2020
 */
public class CalculadoraException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CalculadoraException() {
		super();		
	}

	public CalculadoraException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public CalculadoraException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalculadoraException(String message) {
		super(message);
	}

	public CalculadoraException(Throwable cause) {
		super(cause);
	}
	

}
