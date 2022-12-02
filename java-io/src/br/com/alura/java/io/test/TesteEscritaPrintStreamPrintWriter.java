package br.com.alura.java.io.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
	
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem_Ipsum3.txt"));
//		
//		PrintStream ps = new PrintStream(new File("lorem_Ipsum3.txt"));
		long ini = System.currentTimeMillis();
		
		PrintWriter ps = new PrintWriter(new File("lorem_Ipsum3.txt"));
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		ps.println();
		ps.println("consectetur adipiscing elit.");
		ps.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram " + (fim - ini) + ", milissegundos");
	}

}
