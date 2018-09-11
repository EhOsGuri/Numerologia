package com.bcopstein.Numerologia;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import junitparams.Parameters;

class TesteCalculador {
	private Calculador c;
	private Redutor r;
	private Formatador f;
	
	@Test
	@Parameters ({"05-07-1998,3","12/07/1997,9"})
	void testeNumDaVida(String resp,int esperado) throws ParseException {
		c = new Calculador(r , f);
		int obtido = c.calculaNumeroDaVida(resp);
		assertEquals(obtido, esperado);
		
	}
	@Test
	@Parameters({"Larissa SM,3"})
	void testeNumeroDestino(String resp,int esperado) throws ParseException {
		c=new Calculador(r, f);
		int obtido = c.calculaNumeroDestino(resp);
		assertEquals(obtido, esperado);
	}
	@Test
	@Parameters({"Larissa SM,2"})
	void testeNumeroDesejosDaAlma(String resp,int esperado) throws ParseException {
		c=new Calculador(r, f);
		int obtido = c.calculaNumeroDesejosDaAlma(resp);
		assertEquals(obtido, esperado);
	}

}
