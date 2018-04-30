package com.howtoprogram.junit5.responsabilitiestest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.howtoprogram.junit5.responsabilities.GansitoImpl;
import com.howtoprogram.junit5.responsabilities.ICandyMachine;
import com.howtoprogram.junit5.responsabilities.LollipopImpl;
import com.howtoprogram.junit5.responsabilities.NitoImpl;
import com.howtoprogram.junit5.responsabilities.ProductosMachine;

class CandyMachineTest {

	@Test
	void validateCandyMachineChain() {
		ICandyMachine c1 = new GansitoImpl();
		ICandyMachine c2 = new NitoImpl();
		ICandyMachine c3 = new LollipopImpl();
		
		c1.setNextChange(c2);
		c2.setNextChange(c3);
		
		double myMoney = 1119;
		
		ProductosMachine productosMachine = new ProductosMachine();
		
		productosMachine.setMoney(myMoney);
		productosMachine.setTipo("gansito");
		c1.dispense(productosMachine);
		
		System.out.println(String.format("Gansitos: %d", productosMachine.getGansitos()));
		System.out.println(String.format("Nitos: %d", productosMachine.getNitos()));
		System.out.println(String.format("Paletas: %d", productosMachine.getPaletas()));
		System.out.println(String.format("Money: %f", productosMachine.getMoney()));
		
		/*assertEquals(50,productosMachine.getGansitos());
		assertEquals(0,productosMachine.getNitos());
		assertEquals(19,productosMachine.getPaletas());*/
	}

}
