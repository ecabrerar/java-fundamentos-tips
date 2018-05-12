package com.eudriscabrera.examples.java.core.tips.manejo.recursos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.eudriscabrera.examples.java.core.tips.Team;
import com.eudriscabrera.examples.java.core.tips.excepciones.ExcepcionJdbcMySQL;

/***
 * 
 * @author ecabrerar
 *
 */
public class DemoRecursos {

	public void recursoArchivo() {

		BufferedReader reader = null;
		try {
			reader = Files.newBufferedReader(Paths.get("SonnetI.txt"), StandardCharsets.UTF_8);

			long totalLines = reader.lines().count();

			System.out.println("Number of lines = " + totalLines);
		} catch (IOException ex) {
			Logger.getLogger(DemoRecursos.class.getName()).log(Level.SEVERE, ex.getMessage());
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {

				}
			}
		}
	}

	public void recursoArchivoClosable() {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("SonnetI.txt"), StandardCharsets.UTF_8)) {

			long totalLines = reader.lines().count();

			System.out.println("Number of lines = " + totalLines);
		} catch (IOException ex) {
			Logger.getLogger(DemoRecursos.class.getName()).log(Level.SEVERE, ex.getMessage());
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
			Logger.getLogger(DemoRecursos.class.getName()).log(Level.SEVERE, ex.getMessage());
		}
	}

	public void recursoBaseDatosClosable() throws ExcepcionJdbcMySQL {

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
			Logger.getLogger(DemoRecursos.class.getName()).log(Level.SEVERE, ex.getMessage());
			throw new ExcepcionJdbcMySQL("No pudo encontrar registros");
		}
	}

	public static void main(String... s) throws IOException {
		DemoRecursos demo = new DemoRecursos();
		demo.recursoArchivoClosable();
	}

}
