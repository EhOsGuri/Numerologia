package com.bcopstein.Numerologia;

import java.util.regex.Pattern;

public class Formatador{
    // Formata uma palavra da lingua inglesa
    // A palavra recebida so pode conter letras ou digitos
    // Se a palavra contiver qualquer outro tipo de simbolo deve retornar IllegalArgumentException
    // Se a palavra estiver vazia tambem retorna a excecao
    // Retorna a palavra em maiusculas 
    public String formataPalavra(String palavra){
        try {
        	
	    	
	        char[] letras = palavra.toCharArray();
	        String palavraFinal = "";
	        
	        if(letras.length == 0 || palavra == null) {
	        	throw new IllegalArgumentException();
	        }
	        
	        for(int i=0; i < letras.length; i++) {
	        	if(!Character.isLetterOrDigit(letras[i])) {
	            	throw new IllegalArgumentException();
	        	}
	        	
	        	if(Character.isLetter(letras[i])) {
	        		letras[i] = Character.toUpperCase(letras[i]);
	        		palavraFinal = palavraFinal + letras[i];
	        	}
	        	else {
	        		palavraFinal = palavraFinal + letras[i];
	        	}
	        }
        	return palavraFinal;
        
        }catch(IllegalArgumentException e) {
        	return null;
        }
 
        
    }

    // Utiliza o metodo formataPalavra e confere se a primeira letra nao e numerica
    public String formataPalavraPlus(String palavra) {
    	char first = palavra.charAt(0);
    	if(Character.isDigit(first)) {
    		return null;
    	}else{
    		return formataPalavra(palavra);
    	}
    }

    // Formata frases compostas por palavras separadas por espacos em branco e/ou simbolos de pontuacao
    // Frases vazias geram IllegalArgumentException
    // As palavras da frase devem ser convertidas pelo metodo formataPalavra
    // Qualquer outro simbolo gera IllegalArgumentException
    // Retorna um array de palavras validas 
    public String formataFrase(String frase){
        
    	return null;
    }
}
