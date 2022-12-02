package br.com.alura.estoque.test;

public class Produto implements Comparable<Produto> {

	private String titulo;
	private int tempoFabricacao;

	public Produto(String titulo, int tempoFabricacao) {

		this.titulo = titulo;
		this.tempoFabricacao = tempoFabricacao;
	}
	
	public int getTempoFabricacao() {
		return tempoFabricacao;
	}
	
	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Produto: " + this.titulo + ", Tempo de fabricacao " + this.tempoFabricacao + " - Dia(s)";
	}

	@Override
	public int compareTo(Produto outroProduto) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(outroProduto.getTitulo());
	}

	
}
