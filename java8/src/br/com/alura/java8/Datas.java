package br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate olimpiadasTokyo = LocalDate.of(2030, Month.JUNE, 5);

		int anos = olimpiadasTokyo.getYear() - hoje.getYear();
		System.out.println(anos);

		Period periodo = Period.between(hoje, olimpiadasTokyo);

		LocalDate proximasOlimpiadas = olimpiadasTokyo.plusYears(4);

		System.out.println(proximasOlimpiadas);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);

		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));

		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);

	}

}
