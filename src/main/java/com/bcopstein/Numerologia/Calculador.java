package com.bcopstein.Numerologia;

import java.text.ParseException;

// Todos os metodos geram IllegalArgumentException em caso de caracter ilegal
public class Calculador{
	//Larissa
    private Formatador formatador;
	private int numero;
    private static Redutor reducao;

    // Recebe o redutor e o formatador a serem usados em todos os calculos
    // por injecao de dependencia
    public Calculador(Redutor reducao, Formatador formatador){
        this.reducao = reducao;
        this.formatador = formatador;
        // -----------
    }

	public static int calculaNumeroDaVida(String data) throws ParseException{
    	// http://www.dimension1111.com/numerology-life-path-number.html
    	int aux=reducao.reducaoData(data);
        int numero = 10;
        //aux=Integer.parseInt(data.replaceAll("[^0-9]", ""));
        //System.out.println(aux);
        do {
        	numero=0;
	        while(aux>0){	
	        	numero=numero+aux%10;
	        	aux=aux/10;
	        }	       
	       aux=numero;
        }while(aux>9);
        return numero;
    }

    public int calculaNumeroDestino(String nomeCompleto){
    	// http://www.dimension1111.com/numerology-destiny-number.html   	
        int numero = 0;        
        return numero;
    }
    
    public static int calculaNumeroDesejosDaAlma(String nomeCompleto){
    	//www.dimension1111.com/numerology-soul-urge-number.html
    	int numero=0;
    	/*
    	 * try{	        
	    	char atual;
	    	nomeCompleto=nomeCompleto.replace(" ", "");
	    	for(int i=0;i<nomeCompleto.length();i++) {
	    		atual=nomeCompleto.charAt(i);
	    		if(atual=='A' || atual=='E' || atual=='I' || atual=='O' || atual=='U' ){
	    			numero=numero+reducao.reducaoPalavra(atual + "");
	    		}
	    	}
    	}catch(Exception e) {
    		System.out.println(e);
    	}*/
    	return numero;
    }
    
    public static void main(String args[]) {      
      //System.out.println(calculaNumeroDaVida("12/07/1997"));
    	System.out.println(calculaNumeroDesejosDaAlma("LARISSA"));
    }
}