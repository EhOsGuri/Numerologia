package com.bcopstein.Numerologia;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
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
	            	
	        	}else {		
		        	if(Character.isLetter(letras[i])) {
		        		letras[i] = Character.toUpperCase(letras[i]);
		        		palavraFinal = palavraFinal + letras[i];
		        	}else {
		        		palavraFinal = palavraFinal + letras[i];
		        	}
		        	
	        	}
	        	
	        }
	        palavraFinal = Normalizer.normalize(palavraFinal, Normalizer.Form.NFD);
	        palavraFinal = palavraFinal.replaceAll("[^\\p{ASCII}]", "");
        	return palavraFinal;
        
        }catch(IllegalArgumentException e) {
        	return null;
        }
 
        
    }

    // Utiliza o metodo formataPalavra e confere se a primeira letra nao e numerica
    public String formataPalavraPlus(String palavra) {
    	String str = formataPalavra(palavra);
    	
    	if(str == null || Character.isDigit(str.charAt(0))) {
    		return null;
    	}else {
    		return str;
    	}
    	
}

    // Formata frases compostas por palavras separadas por espacos em branco e/ou simbolos de pontuacao
    // Frases vazias geram IllegalArgumentException
    // As palavras da frase devem ser convertidas pelo metodo formataPalavra
    // Qualquer outro simbolo gera IllegalArgumentException
    // Retorna um array de palavras validas 
    public String formataFrase(String frase){
	   
		try{
	    	if(frase.equals("") || frase == null) {
	    		throw new IllegalArgumentException();
	    	}
	        String[] palavras = frase.split(" ");
	        String str = "";
	        for(int i=0; i < palavras.length; i++) {
	        	if(formataPalavraPlus(palavras[i]) == null) {
	        		
	        	}else {
	        		if(i != 0) {
		        		str = str + " ";
		        	}
	        		str = str + formataPalavraPlus(palavras[i]);
	        	}
	        	
	        }
	        
	    	return str;
		}catch(IllegalArgumentException e) {
    		return null;
    	}
    }
}
