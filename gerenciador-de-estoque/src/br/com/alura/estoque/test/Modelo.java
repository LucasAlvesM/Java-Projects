package br.com.alura.estoque.test;

public class Modelo {
	
	private String nome;
	private int numeroRegistro;
	
	public Modelo(String nome, int numeroRegistro) {
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	
	@Override
	public String toString() {
		return "[ Modelo: " + this.nome + ", Registro: " + this.numeroRegistro + " ]";
	}

}
