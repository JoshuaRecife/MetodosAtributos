package com.joshua;

import java.util.Date;

public class Exerc04 {

	public static void main(String[] args){
		
//		4. Usando o resultado do modelo “Livro” como base, crie uma classe “LivroDeBiblioteca”
//		que represente os dados básicos de um livro de uma biblioteca, que pode ser emprestado
//		a leitores.
		
		LivroDeBiblioteca livroEmprestado = new LivroDeBiblioteca();
		
		livroEmprestado.titulo = "Administração - Teoria, Processo e Prática";
		livroEmprestado.autor = "Chiavenato, Idalberto";
		livroEmprestado.editora = "Manole";
		livroEmprestado.idioma = "Português";
		livroEmprestado.acabamento = "Brochura";
		livroEmprestado.emprestado = true;
		livroEmprestado.emprestadoPara = "Joshua";
		
		livroEmprestado.dataEntrega = new Date();
		
		
	}
}
