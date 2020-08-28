package com.eudriscabrera.examples.java.excepciones;

import java.util.Objects;

/**
 * @author ecabrerar
 * @date Aug 27, 2020
 *
 */
public class Calculadora {

    public Integer sumar(Integer numero1, Integer numero2) {
    	
    	 if(Objects.isNull(numero1) || Objects.isNull(numero2)){
             throw new CalculadoraException("Parametros invalidos");
         }
      
        return numero1 + numero2;
    } 
    
  
}
