package com.joshua.metodos;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.cosumoCombustivel = 0.2;
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		
		System.out.println(autonomia);
		
		System.out.println();
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel10 = " +qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " +qtdCombustivel15);
				

	}

}
