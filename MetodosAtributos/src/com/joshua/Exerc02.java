package com.joshua;

public class Exerc02 {

	public static void main(String[] arg){
//	2. Crie uma classe Livro que represente os dados b�sicos de um livro, 
//		sem se preocupar com a sua finalidade.
		
		Livro livros = new Livro();
		
		livros.nome = "O Pequeno Pr�ncipe";
		
		livros.tipoCapas = new String[3];
		livros.tipoCapas[0] = "Flex�vel";
		livros.tipoCapas[1] = "Mole";
		livros.tipoCapas[2] = "Dura";
		
		livros.tipoRevestimentos = new String[2];
		livros.tipoRevestimentos[0] = "Pl�stico";
		livros.tipoRevestimentos[1] = "Fosco";
		
		livros.preco = 11;
		
	}
}
