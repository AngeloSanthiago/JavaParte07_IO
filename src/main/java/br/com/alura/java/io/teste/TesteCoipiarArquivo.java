package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCoipiarArquivo {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("172.0.0.1", 2732);
		
//		Fluxo de entrada com um arquivo
		InputStream is = new FileInputStream("lorem.txt");
//		InputStream is = socket.getInputStream();
//		InputStream is = System.in;
		Reader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
//		Fluxo de saída de dados
//		OutputStream os = new FileOutputStream("lorem2.txt");
		OutputStream os = socket.getOutputStream();
//		OutputStream os = System.out;
		Writer osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine(); // Aguarda o usuário apertar ENTER para ler do console 
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush(); // Força a saída a ser escrita
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}
}
