package com.joshua.metodos;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double cosumoCombustivel;
	
	void exibirAutonomia(){
		System.out.println("A autonomia do carro é: "+capCombustivel * cosumoCombustivel+" Km");
	}
	
	double obterAutonomia(){
		
		System.out.println("método obterAutonomia foi chamado");
		return capCombustivel * cosumoCombustivel;
	}
	
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/cosumoCombustivel;
		
		return qtdCombustivel;
	}
	
}
