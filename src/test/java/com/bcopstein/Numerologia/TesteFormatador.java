package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteFormatador {
	private Formatador f;
	
	
	@Test
	public void formataPalavraTest() {
		f = new Formatador();
		String str = "teste1";
		String str1 = "teste2,";
		String str2 = "";
		assertEquals("TESTE1", f.formataPalavra(str));
		assertEquals(null, f.formataPalavra(str1));
		assertEquals(null, f.formataPalavra(str2));
		
		
	}

}
