package com.howtoprogram.junit5.observablePractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DemoObservablesIntTest {

	Integer[] arrNumbers = {1,5,10,20};
	
	
	@Test
	@DisplayName("Should Greater than ten")
	void shouldGreaterTanThen() {
		
		Integer[] listExpected = {20};
		
		Integer[] result = DemoObservablesInteger.getGreaterThanThen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should Array Empty Greater than then")
	void shoulEmptyArraydGreaterTanThen() {
		
		Integer[] listExpected = {};
		Integer[] testList = {};
		Integer[] result = DemoObservablesInteger.getGreaterThanThen(testList);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should Duplicate")
	void shouldDuplicate() {
		Integer[] listExpected = {2,10,20,40};
		
		Integer[] result = DemoObservablesInteger.getDuplicateNumbers(arrNumbers);
		System.out.println(String.format("Val1 >> %d , Val2 >> %d, Val3 >> %d, Val4 >> %d",
				result[0],result[1],result[2],result[3]));
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should Array Empty Duplicate")
	void shouldArrayEmpty() {
		
		Integer[] listExpected = {};
		Integer[] testList = {};
		
		Integer[] result = DemoObservablesInteger.getDuplicateNumbers(testList);
		assertArrayEquals(listExpected,result);
		
	}

}
