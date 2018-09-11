package com.bcopstein.Numerologia;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junitparams.Parameters;

class TesteFormatador {
	private Formatador f;
	
	@ParameterizedTest
	@CsvSource({"teste, TESTE", 
				"teste2, TESTE2",
				"Teste.rt palavra, TESTERT PALAVRA",
				"Teste formata frases, TESTE FORMATA FRASES",
				"Testando 2formata frases, TESTANDO FRASES"})
	public void formataPalavraTest(String str, String resp) {
		f = new Formatador();
		assertEquals(resp, f.formataFrase(str));
	}	
}
