/**
 * 
 */
package com.eudriscabrera.examples.java.core.tips.genericos;

import java.util.Collections;
import java.util.List;

import com.eudriscabrera.examples.java.core.tips.Team;

/**
 * @author ecabrerar
 * @date Sep 8, 2018
 */
public class ClaseGenerica<T> {
	private T t;

	public ClaseGenerica(T o) {
		this.t = o;
	}

	public void classType() {
		System.out.println("El tipo de T es ".concat(t.getClass().getName()));
	}

	protected <T> List<T> consultarTodas(String sql, T t) {
		return Collections.emptyList();

	}

	protected <T extends Team> List<T> consultarPorTipo(String sql, T t) {
		return Collections.emptyList();

	}
}
