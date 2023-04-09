package com.rgibert.junit.ta21;

import com.rgibert.junit.ta21.dto.Geometria;

public class mainApp {
	public static void mainApp(String[] args) {
		// Creacion de Objeto Circulo
		Geometria gm = new Geometria(2);
		double areaCirc = gm.areaCirculo(2);
		gm.setArea(areaCirc);
		System.out.println(gm);
	}
}
