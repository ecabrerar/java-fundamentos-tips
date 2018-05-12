
package com.eudriscabrera.examples.java.core.tips.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ecabrerar
 *
 */
public class DemoLogger {

	private final static Logger LOGGER = Logger.getLogger(DemoLogger.class.getName());

	public void loggerAll() {
		LOGGER.log(Level.ALL, "Todos los niveles");
	}

	public void loggerInfo() {
		LOGGER.log(Level.INFO, "Nivel Informativo");
	}

	public void loggerWarning() {
		LOGGER.log(Level.WARNING, "Nivel advertencia");
	}

	public void loggerError() {
		LOGGER.log(Level.SEVERE, "Nivel ERROR");
	}
	

	public static void main(String... s) {
		
		DemoLogger log = new DemoLogger();
		
	String a =	new String("hola");
		
	a.concat("");
		
		log.loggerError();
		log.loggerInfo();
		log.loggerWarning();
		
	
		
	}
}
