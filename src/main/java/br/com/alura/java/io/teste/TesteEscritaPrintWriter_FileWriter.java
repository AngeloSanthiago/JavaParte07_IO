package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintWriter_FileWriter {
	public static void main(String[] args) throws IOException {

//		testeEscrita_versao02_printWriter();		
//		testeEscrita_versao03_FileWriter();
		testeEscrita_versao04_BufferedWriter_com_FileWriter();
		
	}
	
	public static void testeEscrita_versao04_BufferedWriter_com_FileWriter() throws IOException {
		long ini = System.currentTimeMillis();
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Teste de escrita com BufferedWriter");
		bw.newLine();
		bw.write("Teste de escrita com BufferedWriter segunda linha");
		
		bw.close();
		long fim = System.currentTimeMillis();
		System.out.println("Passaram: " +(fim - ini) + " milissegundos");
	}

	public static void testeEscrita_versao02_printWriter() throws FileNotFoundException {
		//		Fluxo de saída de dados
		//		OutputStream os = new FileOutputStream("lorem2.txt");
		//		Writer osw = new OutputStreamWriter(os);
		//		BufferedWriter bw = new BufferedWriter(osw);
		
				
		//		PrintStream ps = new PrintStream("lorem2.txt");
		//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
				PrintWriter ps = new PrintWriter("lorem2.txt");
				
				ps.println("Teste de escrita com PrintStream");
				ps.println();
				ps.println("Teste de escrita com PrintStream segunda linha");
				
				ps.close();
	}
	public static void testeEscrita_versao03_FileWriter() throws IOException {
		//		Fluxo de saída de dados
		//		OutputStream os = new FileOutputStream("lorem2.txt");
		//		Writer osw = new OutputStreamWriter(os);
		//		BufferedWriter bw = new BufferedWriter(osw);
		
		//		PrintStream ps = new PrintStream("lorem2.txt");
		//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
//				PrintWriter ps = new PrintWriter("lorem2.txt");
		
				FileWriter fW = new FileWriter("lorem2.txt");
				
				fW.write("Teste de escrita com FileWriter");
				fW.write("\n");
				fW.write(System.lineSeparator());
				fW.write("Teste de escrita com FileWriter segunda linha");
				
				fW.close();
	}
}
