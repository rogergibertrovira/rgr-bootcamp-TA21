package com.rgibert.junit.ta21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rgibert.junit.ta21.dto.Geometria;

class GeometriaTest {

	Geometria geo;

	@BeforeEach
	public void before() {
		System.out.println("before()");
		geo = new Geometria();
	}

	@Test
	void testGeometriaInt() {
		System.out.println("testGeometriaInt()");
		geo = new Geometria(3);
		Geometria result = geo;
		assertEquals(3, result.getId());
		assertEquals("Triangulo", result.getNom());
		assertEquals(0.0, result.getArea());
	}

	@Test
	void testGeometria() {
		System.out.println("testGeometria()");
		Geometria result = geo;
		assertEquals(9, result.getId());
		assertEquals("Default", result.getNom());
		assertEquals(0.0, result.getArea());
	}

	@Test
	void testAreacuadrado() {
		System.out.println("testAreacuadrado()");
		double result = geo.areacuadrado(2);
		double expected = 4;
		assertEquals(expected, result);
		assertEquals(expected, result);
		assertEquals(expected, result);
	}

	@Test
	void testAreaCirculo() {
		System.out.println("testAreaCirculo()");
		double result = geo.areaCirculo(2);
		double expected = 12.5664;
		assertEquals(expected, result);
	}

	@Test
	void testAreatriangulo() {
		System.out.println("testAreatriangulo()");
		double result = geo.areatriangulo(5, 3);
		double expected = 7.5;
		assertEquals(expected, result);
	}

	@Test
	void testArearectangulo() {
		System.out.println("testArearectangulo()");
		double result = geo.arearectangulo(2, 4);
		double expected = 8;
		assertEquals(expected, result);
	}

	@Test
	void testAreapentagono() {
		System.out.println("testAreapentagono()");
		double result = geo.areapentagono(2, 6);
		double expected = 6;
		assertEquals(expected, result);
	}

	@Test
	void testArearombo() {
		System.out.println("testArearombo()");
		double result = geo.arearombo(4, 5);
		double expected = 10;
		assertEquals(expected, result);
	}

	@Test
	void testArearomboide() {
		System.out.println("testArearomboide()");
		double result = geo.arearomboide(2, 3);
		double expected = 6;
		assertEquals(expected, result);
	}

	@Test
	void testAreatrapecio() {
		System.out.println("testAreatrapecio()");
		double result = geo.areatrapecio(3, 3, 5);
		double expected = 15;
		assertEquals(expected, result);
	}

	// Juego datos para el testFigura
	private static Stream<Arguments> getFormatFixture() {
		return Stream.of(Arguments.of(0, "Default"), Arguments.of(1, "Cuadrado"), Arguments.of(2, "Circulo"),
				Arguments.of(3, "Triangulo"), Arguments.of(4, "Rectangulo"), Arguments.of(5, "Pentagono"),
				Arguments.of(6, "Rombo"), Arguments.of(7, "Romboide"), Arguments.of(8, "Trapecio"));
	}

	@ParameterizedTest
	@MethodSource("getFormatFixture")
	void testFigura(int figInt, String figString) {
		System.out.println("testFigura()");
		String result = geo.figura(figInt);
		assertEquals(figString, result);
	}

	@Test
	void testGetId() {
		System.out.println("testGetId()");
		int result = geo.getId();
		int expected = 9;
		assertEquals(expected, result);
	}

	@Test
	void testSetId() {
		System.out.println("testSetId()");
		geo.setId(2);
		int result = geo.getId();
		int expected = 2;
		assertEquals(expected, result);
	}

	@Test
	void testGetNom() {
		System.out.println("testGetNom()");
		String result = geo.getNom();
		String expected = "Default";
		assertEquals(expected, result);
	}

	@Test
	void testSetNom() {
		System.out.println("testSetNom()");
		geo.setNom("prova");
		String result = geo.getNom();
		String expected = "prova";
		assertEquals(expected, result);
	}

	@Test
	void testGetArea() {
		System.out.println("testGetArea()");
		double result = geo.getArea();
		double expected = 0.0;
		assertEquals(expected, result);
	}

	@Test
	void testSetArea() {
		System.out.println("testSetArea()");
		geo.setArea(18.93);
		double result = geo.getArea();
		double expected = 18.93;
		assertEquals(expected, result);
	}

	@Test
	void testToString() {
		System.out.println("testToString()");
		String result = geo.toString();
		String expected = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(expected, result);
	}

}
