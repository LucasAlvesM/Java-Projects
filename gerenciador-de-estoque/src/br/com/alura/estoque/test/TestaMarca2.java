package br.com.alura.estoque.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaMarca2 {

	public static void main(String[] args) {

		Marca adidas = new Marca("Adidas", "Calcados");

		adidas.adiciona(new Produto("Casual", 10));
		adidas.adiciona(new Produto("Corrida", 90));
		adidas.adiciona(new Produto("Social", 10));
		adidas.adiciona(new Produto("Flexivel", 17));

		List<Produto> produtosImutaveis = adidas.getProdutos();
		System.out.println(produtosImutaveis);
		
		List<Produto> produtos = new ArrayList<>(produtosImutaveis);
		
		
		System.out.println(adidas.getProdutos());

		Collections.sort(produtos);
		System.out.println(produtos);

		System.out.println(adidas.getTempoTotalFabricacao());
		System.out.println(adidas);
	}

}
