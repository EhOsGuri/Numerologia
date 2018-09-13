package com.bcopstein.Numerologia;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.text.ParseException;

class TesteCalculador {
	private Calculador c;
	private Redutor r;
	private Formatador f;
	
	@ParameterizedTest
	@CsvSource({"12/07/1997,9"})
	void testeNumDaVida(String resp,int esperado) throws ParseException {
		c = new Calculador(r , f);
		int obtido = c.calculaNumeroDaVida(resp);
		assertEquals(obtido, esperado);
		
	}
	@ParameterizedTest
	@CsvSource({"Larissa SM,3"})
	void testeNumeroDestino(String resp,int esperado) throws ParseException {
		c=new Calculador(r, f);
		int obtido = c.calculaNumeroDestino(resp);
		assertEquals(obtido, esperado);
	}
	/*@ParameterizedTest
	@CsvSource({"Larissa SM,2"})
	void testeNumeroDesejosDaAlma(String resp,int esperado) throws ParseException {
		c=new Calculador(r, f);
		int obtido = c.calculaNumeroDesejosDaAlma(resp);
		assertEquals(obtido, esperado);
	}*/

}
