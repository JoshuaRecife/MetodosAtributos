package com.joshua;

public class Exerc03 {
	
	public static void main(String[] arg){
//		3. Usando o resultado do exerc�cio anterior como base, crie uma classe
//		�LivroDeLivraria� que represente os dados b�sicos de um livro que est�
//		� venda em uma livraria.		
		LivroDeLivraria livro01 = new LivroDeLivraria();
		
		livro01.titulo = "A Organiza��o Androide";
		livro01.editora = "FGV";
		livro01.idioma = "Portugu�s";
		livro01.acabamento = "Brochura";
		
		livro01.dimensoesProduto = new double[3];
		livro01.dimensoesProduto[0] = 14;
		livro01.dimensoesProduto[1] = 21;
		livro01.dimensoesProduto[2] = 14;
	}
}
