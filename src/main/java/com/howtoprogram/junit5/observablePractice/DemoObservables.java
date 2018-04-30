package com.howtoprogram.junit5.observablePractice;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import io.reactivex.Flowable;
import io.reactivex.Observable;

public class DemoObservables {

	public static int[] getGreaterThanThen(int[] arrNumbers) {
		
		Integer[] arrIntNumbers = Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);
				
		List<Integer> resultList = new ArrayList<>();
		
		Flowable
			.fromArray(arrIntNumbers)
			.filter(x -> x > 10 )
			.toList()
			.subscribe(x -> {resultList.addAll(x);});
		
		return resultList.stream().mapToInt(x -> x).toArray();
	}

	public static int[] getDuplicateNumbers(int[] arrNumbers) {
		
		Integer[] arrIntNumbers = Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);
		
		java.util.List<Integer> resultList = new ArrayList<>();
		
		Flowable
			.fromArray(arrIntNumbers)
			.map(x -> x*2 )
			.toList()
			.subscribe(x -> resultList.addAll(x));
		
		return resultList.stream().mapToInt(x -> x).toArray();
	}
	
}
