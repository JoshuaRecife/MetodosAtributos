package com.joshua;

public class Exerc05 {
	
	public static void main(String[] args){
		
//		5. Cria uma classe para representar uma conta corrente que possui um n�mero,
//			um saldo, um status que informa se ela � especial ou n�o, um limite.
		ContaCorrente conta01 = new ContaCorrente();
		
		conta01.agencia = "Banco do Brasil";
		conta01.numero = 123456;
		conta01.saldo = 23000;
		conta01.especial = true;
		conta01.limite = 5000;
		
	}
}
