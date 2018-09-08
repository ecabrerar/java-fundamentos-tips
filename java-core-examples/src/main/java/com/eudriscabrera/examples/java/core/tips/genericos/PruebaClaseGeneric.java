/**
 * 
 */
package com.eudriscabrera.examples.java.core.tips.genericos;

import com.eudriscabrera.examples.java.core.tips.Team;

/**
 * @author ecabrerar
 * @date Sep 8, 2018
 */
public class PruebaClaseGeneric {

	
	public static void main(String[] args) {
		// Creamos una instancia de ClaseGenerica para Integer.
	    ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
	    intObj.classType();
	 
	    // Creamos una instancia de ClaseGenerica para String.
	    ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
	    strObj.classType();
	    
	    
	 // Creamos una instancia de ClaseGenerica para Team.
	    ClaseGenerica<Team> strTeam = new ClaseGenerica<Team>(new Team());
	    strObj.classType();
	}

}
