package com.howtoprogram.junit5.observablePractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DemoObservableTest {

	int[] arrNumbers = {1,5,10,20};
	
	
	@Test
	@DisplayName("Should Greater than ten")
	void shouldGreaterTanThen() {
		
		int[] listExpected = {20};
		
		int[] result = DemoObservables.getGreaterThanThen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should Array Empty Greater than then")
	void shoulEmptyArraydGreaterTanThen() {
		
		int[] listExpected = {};
		int[] testList = {};
		
		int[] result = DemoObservables.getGreaterThanThen(testList);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("Should Duplicate")
	void shouldDuplicate() {
		
		int[] listExpected = {2,10,20,40};
		
		int[] result = DemoObservables.getDuplicateNumbers(arrNumbers);
		assertArrayEquals(listExpected,result);
		
	}
	
	@Test
	@DisplayName("Should Array Empty Duplicate")
	void shouldArrayEmpty() {
		
		int[] listExpected = {};
		int[] testList = {};
	
		int[] result = DemoObservables.getDuplicateNumbers(testList);
		assertArrayEquals(listExpected,result);
		
	}

}
