/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author ecabrerar
 */
public class StreamBasicos {


    private void ejecutar(){
        System.out.println("Stream Básicos");

        System.out.println("Ejecutando ejercicio 1");
        ejercicio1();

   

    }

    /**
     * Procesar la siguiente lista para que solamente contenga cadena de caracteres impares
     */
    private void ejercicio1() {

        List<String> list = Arrays.asList(
        "BarCamp", "MongoDB", "10Gen", "TokuMX", "Nagios", "PUCMM", "Ruby", "JSON", "JSON");

         
        List<String> listImpares = new ArrayList<String>();
        
        for (String elemento : listImpares) {
			
        	if(elemento.length() % 2==1) {
        		listImpares.add(elemento);
        	}
		}

        for (String elemento : listImpares) {
        	System.out.println(elemento);
        }
        
        // Que tal si quisiera obtener un listado de los que tienen longitud par?
      
    }

       /**
      * Convertir par de datos del map en un stream
      *
     */


    public static void main(String[] args) {
        StreamBasicos stream = new StreamBasicos();
        stream.ejecutar();
    }


}