package com.bcopstein.Numerologia;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitparams.Parameters;

class TesteCalculador {
	private Calculador c;
	private Redutor r;
	private Formatador f;
	
	@Test
	@Parameters ({"05-07-1998,3","12/07/1997,9"})
	void testeNumDaVida(String resp,int esperado) {
		c = new Calculador(r , f);
		int obtido = c.calculaNumeroDaVida(resp);
		assertEquals(obtido, esperado);
		
	}

}
