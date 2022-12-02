package br.com.alura.estoque.test;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Marca {

	private String nome;
	private String tipoProduto;
	private List<Produto> produtos = new LinkedList<Produto>();
	private Set<Modelo> modelos = new HashSet<>();

	public Marca(String nome, String tipoProduto) {
		this.nome = nome;
		this.tipoProduto = tipoProduto;
	}

	public String getNome() {
		return nome;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public List<Produto> getProdutos() {
		return Collections.unmodifiableList(produtos);
	}

	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}

	public int getTempoTotalFabricacao() {
		return this.produtos.stream().mapToInt(Produto::getTempoFabricacao).sum();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Modelo: " + nome + ", Categoria de Produtos: " + tipoProduto + ", Data de Fabricação: "
				+ this.getTempoTotalFabricacao() + ", " + "Produtos: " + this.produtos + "]";
	}

	public void registra(Modelo modelo) {
		this.modelos.add(modelo);
	}
	
	public Set<Modelo> getModelo() {
	    return Collections.unmodifiableSet(modelos);
	}
}
