package com.bcopstein.Numerologia;

import static org.junit.Assert.assertThat;
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
		String str = "teste";
		String str1 = "teste2,";
		String str2 = "";
		assertEquals("TESTEPALAVRA", f.formataPalavra(str));
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
	
	@Test
	public void formataFrasesTest() {
		f = new Formatador();
		String str = "Testando formata frases";
		String str1 = "";
		String str2 = "Testando 2formata frases";
		assertEquals("TESTANDO FORMATA FRASES", f.formataFrase(str));
		assertEquals(null, f.formataFrase(str1));
		assertEquals("TESTANDO FRASES", f.formataFrase(str2));
	}

}
