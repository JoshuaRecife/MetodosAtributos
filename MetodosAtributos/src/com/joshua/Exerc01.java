package com.joshua;

public class Exerc01 {

	public static void main(String[] arg){
//		1. Escreva uma classe para representar uma lâmpada que 
//		está à venda em um supermercado.	
		
		Lampada Lampada = new Lampada();
		
		Lampada.marca = "osram";
		Lampada.durabilidade = "8 mil horas";
		Lampada.preco = 10;
		
		Lampada.tipos = new String[3];
		
		Lampada.tipos[0] = "Fluorescente";
		Lampada.tipos[1] = "Abaju";
		Lampada.tipos[2] = "Branca";
		
		
		
	}
}
