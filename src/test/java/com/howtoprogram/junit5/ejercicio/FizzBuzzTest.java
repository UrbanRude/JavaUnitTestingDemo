package com.howtoprogram.junit5.ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testArray() {
		String[] arrFizzBuzz = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
		int valorI = 1,valorII=15;
		String[] result = FizzBuzz.getListFizzBuzz(valorI,valorII);
		assertArrayEquals(arrFizzBuzz,result);
	}
	
	@Test
	void testValueOneHigher() {
		int valorI = 15,valorII=1;
		String[] result = FizzBuzz.getListFizzBuzz(valorI,valorII);
		assertArrayEquals(null,result);
	}

}
