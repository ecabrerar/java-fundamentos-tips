package com.eudriscabrera.examples.java.logger;

import java.sql.SQLException;

/**
 * @author ecabrerar
 *
 */
public class DemoLogger {

	public void miLogger() {
		
		try {
			lanzaExcepcion();
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}
	
	private void lanzaExcepcion() throws SQLException {
		throw  new SQLException();
	}
	

	public static void main(String... s) {

		DemoLogger log = new DemoLogger();

	}
}
