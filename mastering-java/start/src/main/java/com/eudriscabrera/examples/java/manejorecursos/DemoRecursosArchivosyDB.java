package com.eudriscabrera.examples.java.manejorecursos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ecabrerar
 * @date Aug 27, 2020
 *
 */
public class DemoRecursosArchivosyDB {
	public void recursoArchivo() {

		BufferedReader reader = null;
		try {
			reader = Files.newBufferedReader(Paths.get("SonnetI.txt"), StandardCharsets.UTF_8);

			long totalLines = reader.lines().count();

			System.out.println("Number of lines = " + totalLines);
		} catch (IOException ex) {
			Logger.getLogger(DemoRecursosArchivosyDB.class.getName()).log(Level.SEVERE, ex.getMessage());
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {

				}
			}
		}
	}

	/*
	public void recursoArchivoClosable() {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("SonnetI.txt"), StandardCharsets.UTF_8)) {

			long totalLines = reader.lines().count();

			System.out.println("Number of lines = " + totalLines);
		} catch (IOException ex) {
			Logger.getLogger(DemoRecursosArchivosyDB.class.getName()).log(Level.SEVERE, ex.getMessage());
		}
	}

	public void recursoBaseDatos() {

		String sqlSelect = "select * from teams order by id asc";

		List<Team> teams = new ArrayList<>();
		
		Connection con = ConeccionDB.getInstancia().getConeccion();

		try  {

			PreparedStatement stmt = con.prepareStatement(sqlSelect);

				ResultSet rs = stmt.executeQuery();

					while (rs.next()) {

					}
				
					rs.close();
					stmt.close();
			
		} catch (SQLException ex) {
			Logger.getLogger(DemoRecursosArchivosyDB.class.getName()).log(Level.SEVERE, ex.getMessage());
		}
	}

	public void recursoBaseDatosClosable()  {

		String sqlSelect = "select * from teams order by id asc";

		List<Team> teams = new ArrayList<>();

		try (Connection con = ConeccionDB.getInstancia().getConeccion()) {

			try (PreparedStatement stmt = con.prepareStatement(sqlSelect)) {

				try (ResultSet rs = stmt.executeQuery()) {

					while (rs.next()) {

					}
				}

			}
		} catch (SQLException ex) {
			Logger.getLogger(DemoRecursosArchivosyDB.class.getName()).log(Level.SEVERE, ex.getMessage());
			throw new Exception("No pudo encontrar registros");
		}
	}
	*/

	public static void main(String... s) throws IOException {
		DemoRecursosArchivosyDB demo = new DemoRecursosArchivosyDB();
		demo.recursoArchivo();
	}
}
