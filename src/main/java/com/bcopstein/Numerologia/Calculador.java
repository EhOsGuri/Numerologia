package com.bcopstein.Numerologia;

import java.text.ParseException;

// Todos os metodos geram IllegalArgumentException em caso de caracter ilegal
public class Calculador{
	//Larissa
    private static Formatador formatador;
	private int numero;
    private static Redutor reducao;

    // Recebe o redutor e o formatador a serem usados em todos os calculos
    // por injecao de dependencia
    public Calculador(Redutor reducao, Formatador formatador){
        this.reducao = reducao;
        this.formatador = formatador;
        // -----------
    }

	public int calculaNumeroDaVida(String data)throws ParseException{
    	// http://www.dimension1111.com/numerology-life-path-number.html
        int numero = 0;
        try {
        	numero=reducao.reducaoPalavra(formatador.formataPalavra(data));
        }catch(IllegalArgumentException e) {
        	System.out.println(e);
        }
        return numero;
      
    }

    public int calculaNumeroDestino(String nomeCompleto)throws ParseException{
    	// http://www.dimension1111.com/numerology-destiny-number.html   	
    	 int numero = 0;
         try {
         	nomeCompleto=formatador.formataFrase(nomeCompleto);
         	numero=reducao.reducaoFrase(nomeCompleto);
         	
         }catch(IllegalArgumentException e) {
         	System.out.println(e);
         }
         return numero;
    }
    
    public static int calculaNumeroDesejosDaAlma(String nomeCompleto)throws ParseException{
    	//www.dimension1111.com/numerology-soul-urge-number.html
    	 int numero = 0;
         try {
        	 nomeCompleto=formatador.formataFrase(nomeCompleto);
        	// numero=reducao.reducaoFrase(nomeCompleto);
         }catch(IllegalArgumentException e) {
         	System.out.println(e);
         }
         return numero;
    }
}