package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
	
//
//		OutputStream fos = System.out;
//		//s.getOutputStream();  //new FileOutputStream("lorem_Ipsum2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem_Ipsum3.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		bw.newLine();
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		
		bw.close();
	}

}
