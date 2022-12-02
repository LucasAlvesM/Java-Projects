package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("Casa do Codigo");
		palavras.add("Caelum");

		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		//palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

		System.out.println(palavras);

		palavras.forEach(s -> System.out.println(s));

		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}

}
