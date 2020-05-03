package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita2 {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Teste de escrita em arquivo2");
		bw.write(System.lineSeparator());
//		bw.write("\r\n");
		bw.newLine();
		bw.write("Teste de escrita em arquivo segunda linha");
		bw.newLine();
//		bw.write("\r\n");
		bw.write("Teste de escrita em arquivo terceira linha");
		bw.newLine();
		bw.write("\r\n");
		bw.write("Teste de escrita em arquivo quarta linha");
		
		bw.close();
		
		
//		Fim Escrever somente com FileWriter
//		Fluxo de saída de dados
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
// INICIO Escrever somente com FileWriter
//		FileWriter bf = new FileWriter("lorem2.txt");
//		bf.write("Teste de escrita em arquivo2");
//		bf.write(System.lineSeparator());
//		bf.write("\r\n");
//		bf.write("Teste de escrita em arquivo segunda linha");
//		bf.write("Teste de escrita em arquivo terceira linha");
//		
//		bf.close();
// Fim Escrever somente com FileWriter
		
		
	}
}
