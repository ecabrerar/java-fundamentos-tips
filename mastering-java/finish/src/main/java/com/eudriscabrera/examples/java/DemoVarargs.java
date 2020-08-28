package com.eudriscabrera.examples.java;

/**
 * @author ecabrerar
 * @date Aug 27, 2020
 *
 */
public class DemoVarargs {

	public static int sumador(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public static int sumador(int i, int j, int k) {
		return i + j + k;
	}

	public static int sumador(int i, int j, int k, int l) {
		return i + j + k + l;
	}
	
	public static int sumador(int...numeros) {
		
		int total = 0;
		
		for(int n : numeros) {
			total += n;
		}
		
		return total;
	}
	
	  

	public static void main(String... s) {

		System.out.println(DemoVarargs.sumador(10, 20));

		// que tal si queremos sumar 3 valores

		System.out.println(DemoVarargs.sumador(10, 20, 23));
		
		// que tal si queremos sumar 4 valores

		System.out.println(DemoVarargs.sumador(10, 20, 7, 9));
		
		//Si queremos sumar n numeros usando la forma anterior tendríamos que crear N metodos.
		//Propongo una forma mas efectiva y es usar varargs
		
		System.out.println(DemoVarargs.sumador(10, 20, 7, 9,56,8,2));
	}

}
