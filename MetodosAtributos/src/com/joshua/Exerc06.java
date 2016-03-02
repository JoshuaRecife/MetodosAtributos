package com.joshua;

public class Exerc06 {

//	6. Crie uma classe que represente um contato da agenda do seu celular.
	
	public static void main(String[] args){
		
		AgendaCelular contato1 = new AgendaCelular();
		
		contato1.nome = "Joshua";
		contato1.numCelular = "(21)98899-8899";
		contato1.email = "umemailvalido@.com.br";
		
		System.out.println("Nome do Contato = "+contato1.nome);
		System.out.println("Nome do Contato = "+contato1.numCelular);
		System.out.println("Nome do Contato = "+contato1.email);
	}
}
