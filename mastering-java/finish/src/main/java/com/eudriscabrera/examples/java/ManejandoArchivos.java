package com.eudriscabrera.examples.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ecabrerar
 * @since Aug 27, 2020
 */
public class ManejandoArchivos {

	public static void main(String... s) {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("SonnetI.txt"), StandardCharsets.UTF_8)) {
			long totalLines = reader.lines().count();

			System.out.println("Number of lines = " + totalLines);
		} catch (IOException ex) {
			Logger.getLogger(ManejandoArchivos.class.getName()).log(Level.SEVERE, ex.getMessage());
		}
	}
}
