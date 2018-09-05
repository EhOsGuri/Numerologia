package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junitparams.Parameters;

class TesteFormatador {
	private Formatador f;
	
	
	@Test
	public void formataPalavraTest() {
		f = new Formatador();
		String str = "teste1";
		String str1 = "teste2,";
		String str2 = "";
		assertEquals("TESTE1", f.formataPalavra(str));
		assertEquals("TESTE2", f.formataPalavra(str1));
		assertEquals(null, f.formataPalavra(str2));
		
		
	}
	
	@Test
	public void formataPalavraPlusTest() {
		f = new Formatador();
		String str = "teste1";
		String str1 = "teste2/";
		String str2 = "3teste";
		String str3 = "";
		assertEquals("TESTE1", f.formataPalavraPlus(str));
		assertEquals("TESTE2", f.formataPalavraPlus(str1));
		assertEquals(null, f.formataPalavraPlus(str2));
		assertEquals(null, f.formataPalavraPlus(str3));
	}

}
