/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.java.core.tips.stream;

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

        System.out.println("Ejecutando ejercicio 2");
        ejercicio2();

    }

    /**
     * Procesar la siguiente lista para que solamente contenga cadena de caracteres impares
     */
    private void ejercicio1() {

        List<String> list = Arrays.asList(
        "BarCamp", "MongoDB", "10Gen", "TokuMX", "Nagios", "PUCMM", "Ruby", "JSON", "JSON");


      List<String> newList = list
            .stream()
            .filter(s -> (s.length() % 2)==1)
            .map(String::toLowerCase)
           .peek(System.out::println)
          .collect(Collectors.toList());


     List<String> newList1 = list
            .stream()
            .filter(s -> (s.length() % 2)==1)
            .map(String::toLowerCase)
            .peek(s -> s.toString())
            .collect(Collectors.toList());


       // newList1.forEach(System.out::println);
    }

       /**
      * Convertir par de datos del map en un stream
      *
     */
    private void ejercicio2(){
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);


        StringBuilder sb = new StringBuilder(150);
        map.forEach((String k, Integer v) -> {
            sb.append(String.format("%s%s", k,v));
        });

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        StreamBasicos stream = new StreamBasicos();
        stream.ejecutar();
    }


}