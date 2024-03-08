package com.eudriscabrera.examples.java;

import java.util.stream.IntStream;


public class TestDRY {

	// Don't Repeat Yourself (DRY)	
	public int sumar(int num1, int num2) {
		return num1 +  num2;
	}
	
	public int sumar(int num1, int num2, int num3) {
		return num1 +  num2 + num3;
	}
	
	public int sumar(int [] numeros) {
		return IntStream.of(numeros).sum();
	}
}
