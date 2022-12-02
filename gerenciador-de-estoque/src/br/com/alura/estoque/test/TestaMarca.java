package br.com.alura.estoque.test;

import java.util.List;

public class TestaMarca {

	public static void main(String[] args) {

		Marca adidas = new Marca("Adidas", "Calcados");

		List<Produto> produtos = adidas.getProdutos();

		System.out.println(produtos);

		adidas.adiciona(new Produto("Lite Racer 3.0", 10));
		adidas.adiciona(new Produto("Yeezy Boost", 90));
		adidas.adiciona(new Produto("NMD_R1", 10));
		adidas.adiciona(new Produto("NMD_R4", 17));

		System.out.println(adidas.getProdutos());

	}

}
