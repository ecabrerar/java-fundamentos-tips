package com.eudriscabrera.examples.java.logger;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

/**
 * @author ecabrerar
 *
 */
public class DemoLogger {

	public void miLogger() {

		try {
			lanzaExcepcion();
		} catch (Exception ex) {
			// java.util.logging
			Logger.getLogger(DemoLogger.class.getName()).log(Level.WARNING, ex.getMessage());

		}
	}

	public void miLogger2() {

		try {
			lanzaExcepcion();
		} catch (Exception ex) {
			// slf4j + logback
			LoggerFactory.getLogger("LOGGER 2").info("LOGGER ESPECIAL {}", ex.getMessage());

		}
	}

	private void lanzaExcepcion() throws SQLException {
		throw new SQLException("ERRROR");
	}

	public static void main(String... s) {

		DemoLogger log = new DemoLogger();
		log.miLogger();
		log.miLogger2();

	}
}
