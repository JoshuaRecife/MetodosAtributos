package com.joshua.metodos;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double cosumoCombustivel;
	
	void exibirAutonomia(){
		System.out.println("A autonomia do carro �: "+capCombustivel * cosumoCombustivel+" Km");
	}
	
	double obterAutonomia(){
		
		System.out.println("m�todo obterAutonomia foi chamado");
		return capCombustivel * cosumoCombustivel;
	}
	
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/cosumoCombustivel;
		
		return qtdCombustivel;
	}
	
}
