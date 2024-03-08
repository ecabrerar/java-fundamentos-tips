package com.eudriscabrera.examples.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.eudriscabrera.examples.java.sr.TitleNotNull;

public class TestIoI {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();
		HashMap<String, String> mapa = new HashMap<>();

		List<String> lista1 = new LinkedList<>();
		Map<String, String> mapa1 = new ConcurrentHashMap<>();

	}

	public void printAnimal(Animal animal) {

	}

	public void validar() {

		
		String title = null;
		
		List<IValidador> validaciones = new ArrayList<>();
		validaciones.add(new TitleNotNull());
		validaciones.add(new TitleLengthGreaterFive());
		
		
		for (IValidador iValidador : validaciones) {
			
			if(!iValidador.validar(title)) {
				return;
			}
		}
		
		/*
		 * validaciones.stream() .filter( val -> !val.validar(title)) .findAny();
		 */
		
		
		
//
//		if (title.isBlank()) {
//
//		}
//
//		if (title != null && title.length() > 5) {
//
//		}
//
//		if (title != null && (title.length() % 2 ==0) ) {
//
//		}

	}

}
