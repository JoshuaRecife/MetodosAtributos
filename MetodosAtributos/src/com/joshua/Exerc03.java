package com.joshua;

public class Exerc03 {
	
	public static void main(String[] arg){
//		3. Usando o resultado do exercício anterior como base, crie uma classe
//		“LivroDeLivraria” que represente os dados básicos de um livro que está
//		à venda em uma livraria.		
		LivroDeLivraria livro01 = new LivroDeLivraria();
		
		livro01.titulo = "A Organização Androide";
		livro01.editora = "FGV";
		livro01.idioma = "Português";
		livro01.acabamento = "Brochura";
		
		livro01.dimensoesProduto = new double[3];
		livro01.dimensoesProduto[0] = 14;
		livro01.dimensoesProduto[1] = 21;
		livro01.dimensoesProduto[2] = 14;
	}
}
