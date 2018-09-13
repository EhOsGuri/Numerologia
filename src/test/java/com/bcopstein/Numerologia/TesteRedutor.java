package com.bcopstein.Numerologia;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junitparams.Parameters;

class TesteRedutor {
	
	private Redutor r;
	
	@Test
	public void reducaoPalavraTest() throws ParseException {
		r = new Redutor();
		assertEquals(1, r.reducaoFrase("A"));
		assertEquals(1, r.reducaoPalavra("A"));
		assertEquals(7, r.reducaoData("01/11/1111"));
		
	}
	
}
