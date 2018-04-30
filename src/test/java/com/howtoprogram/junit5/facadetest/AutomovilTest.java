package com.howtoprogram.junit5.facadetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.howtoprogram.junit5.facade.Arrancar;
import com.howtoprogram.junit5.facade.AutomovilFacade;
import com.howtoprogram.junit5.facade.ComprobarAsientos;
import com.howtoprogram.junit5.facade.ComprobarEspejos;
import com.howtoprogram.junit5.facade.ComprobarGasolina;
import com.howtoprogram.junit5.facade.ComprobarLiquidos;

class AutomovilTest {

	@Test
	void encenderAuto() {
		AutomovilFacade automovilFacade = new AutomovilFacade();
		automovilFacade.arrancar();
	}

}
