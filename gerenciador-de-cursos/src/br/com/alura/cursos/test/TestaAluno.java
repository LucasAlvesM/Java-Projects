package br.com.alura.cursos.test;

import java.util.Collection;
import java.util.HashSet;

public class TestaAluno {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Robin");
		alunos.add("Sanji");
		alunos.add("Brook");
		alunos.add("Zoro");
		alunos.add("Luffy");
		alunos.add("Franky");
		alunos.add("Usopp");
		alunos.add("Chopper");
		alunos.add("Nami");

		
		boolean luffyEstaMatriculado = alunos.contains("luffy");
		System.out.println(luffyEstaMatriculado);
		
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	}

}
