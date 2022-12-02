package br.com.alura.cursos.test;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Aluno outro = (Aluno) obj;
		return Objects.equals(nome, outro.nome) && numeroMatricula == outro.numeroMatricula;
	}

	@Override
	public String toString() {
		return "[ Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + " ]";
	}

}
