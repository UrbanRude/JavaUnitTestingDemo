package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculadoraTest {

	int num, numII;
	Calculador calc;

	@Test
	void sumaTest() {
		num = 99;
		numII = -30;
		calc = new Calculador();
		assertEquals((num + numII), calc.suma(num, numII));
	}

	@Test
	void restaTest() {
		num = 99;
		numII = -30;
		calc = new Calculador();
		assertEquals((numII - num), calc.resta(numII, num));
	}

	@Test
	void mulTest() {
		num = 99;
		numII = -30;
		calc = new Calculador();
		assertEquals((num * numII), calc.mul(num, numII));
	}

	@Test
	void divTestDivisorCero() {
		num = 90;
		numII = 0;
		calc = new Calculador();
		assertEquals(0, calc.div(num, numII));
	}

	@Test
	void divTestDobleCero() {
		num = 0;
		numII = 0;
		calc = new Calculador();
		assertEquals(0, calc.div(num, numII));
	}

	@Test
	void divTest() {
		int divisor = 4;
		int dividendo = 16;
		calc = new Calculador();
		assertEquals((dividendo / divisor), calc.div(dividendo, divisor));
	}

	@Test
	void sumaTestMockito() {
		Calculador calculador = mock(Calculador.class);
		when(calculador.suma(20, 20)).thenReturn(80);
		int suma = calculador.suma(20, 20);
		assertEquals(80, suma);
	}

	@Test
	void restaTestMockito() {
		Calculador calculador = mock(Calculador.class);
		when(calculador.resta(10, 5)).thenReturn(30);
		int resta = calculador.resta(10, 5);
		assertEquals(30, resta);
	}

	@Test
	void mullTestMockito() {
		Calculador calculador = mock(Calculador.class);
		when(calculador.mul(6, 10)).thenReturn(200);
		int mul = calculador.mul(6, 10);
		assertEquals(200, mul);
	}

	@Test
	void divTestMockito() {
		Calculador calculador = mock(Calculador.class);
		when(calculador.div(10, 5)).thenReturn(100);
		int div = calculador.div(10, 5);
		assertEquals(100, div);
	}

}
