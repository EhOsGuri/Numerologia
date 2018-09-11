package com.bcopstein.Numerologia;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junitparams.Parameters;

class TesteRedutor {
	
	private Redutor r;
	
	@Test
	public void reducaoPalavraTest() {
		r = new Redutor();
		assertEquals(1, r.reducaoFrase("A"));
		
		
	}
	
}
