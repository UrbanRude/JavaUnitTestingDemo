package com.howtoprogram.junit5;

public class Calculador {

	private String error;
	
	public int suma(int num,int numII) {
		return num+numII;
	}

	public int resta(int num,int numII) {
		return num-numII;
	}
	
	public int mul(int num,int numII) {
		return num*numII;
	}
	
	public int div(int num,int numII) {
		return numII != 0 ? num/numII : 0; 
	}
			
	
}
