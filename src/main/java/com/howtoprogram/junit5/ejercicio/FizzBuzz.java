package com.howtoprogram.junit5.ejercicio;

public class FizzBuzz {

	public static String[] getListFizzBuzz(int valorI, int valorII) {	
		
		if(valorI < valorII) {
			int tamaño = (valorII-valorI)+1;
			String[] arrFizzBuzz = new String[tamaño];
			for(int i=0;i<tamaño;i++) {
				if(valorI%5 == 0 && valorI%3 == 0) {
					arrFizzBuzz[i] = "FizzBuzz";
					valorI += 1;
					continue;
				}else if(valorI%3 == 0) {
					arrFizzBuzz[i] = "Fizz";
					valorI += 1;
					continue;
				}else if(valorI%5 == 0) {
					arrFizzBuzz[i] = "Buzz";
					valorI += 1;
					continue;
				}arrFizzBuzz[i] = String.valueOf(valorI);
				valorI += 1;				
			}
			return  arrFizzBuzz;
		}
		
		return null;
	}
	
	
	
	public static void main(String[] args) {
		String[] a = getListFizzBuzz(1,100);
		for (String string : a) {
			System.out.println(string);
		}
	}

}


