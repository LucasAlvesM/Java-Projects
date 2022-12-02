package br.com.alura.estoque.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeProdutos {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Arroz Integral", 5);
		Produto p2 = new Produto("Carne enlatada", 3);
		Produto p3 = new Produto("Queijo mussarela", 1);
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		
		System.out.println(produtos);
		
		Collections.sort(produtos);
		
		produtos.sort(Comparator.comparing(Produto::getTempoFabricacao));
		System.out.println(produtos);
		
	}

}
