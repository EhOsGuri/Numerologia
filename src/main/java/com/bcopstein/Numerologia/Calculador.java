package com.bcopstein.Numerologia;

// Todos os metodos geram IllegalArgumentException em caso de caracter ilegal
public class Calculador{
	//Larissa
    private Formatador formatador;
    private Redutor reducao;

    // Recebe o redutor e o formatador a serem usados em todos os calculos
    // por injecao de dependencia
    public Calculador(Redutor reducao, Formatador formatador){
        this.reducao = reducao;
        this.formatador = formatador;
        // -----------
    }

    public int calculaNumeroDaVida(String data){
    	// http://www.dimension1111.com/numerology-life-path-number.html
        int numero = 0;
        while(numero>9) {	
        }
        return numero;
    }

    public int calculaNumeroDestino(String nomeCompleto){
    	// http://www.dimension1111.com/numerology-destiny-number.html
        int numero = 0;
        return numero;
    }
    
    public int calculaNumeroDesejosDaAlma(String nomeCompleto){
    	// http://www.dimension1111.com/numerology-soul-urge-number.html
    	int numero = 0;
        return numero;
    }
}