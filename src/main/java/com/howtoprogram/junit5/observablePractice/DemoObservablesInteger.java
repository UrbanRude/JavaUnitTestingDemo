package com.howtoprogram.junit5.observablePractice;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;

public class DemoObservablesInteger {

	public static Integer[] getGreaterThanThen(Integer[] arrNumbers) {
		List<Integer> resultList = new ArrayList<Integer>();
		Flowable
			.fromArray(arrNumbers)
			.filter( x -> x > 10)
			.toList()
			.subscribe(x -> {resultList.addAll(x);});
	
		return resultList.toArray(new Integer[0]);
	}

	public static Integer[] getDuplicateNumbers(Integer[] arrNumbers) {
		List<Integer> resultList = new ArrayList<Integer>();
		Flowable
			.fromArray(arrNumbers)
			.map( x -> x * 2)
			.toList()
			.subscribe(x -> {resultList.addAll(x);});
		//resultList.stream().toArray(Integer[]::new);
		return resultList.toArray(new Integer[0]);
	}

}
