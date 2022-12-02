package br.com.lucas.bytebank;

import br.com.bytebank.banco.model.Conta;

import br.com.bytebank.banco.model.ContaCorrente;

public class TesteBiblioteca {
	
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 421);
		
		c.deposita(2093.2);
		
		System.out.println(c.getSaldo());
	}

}
