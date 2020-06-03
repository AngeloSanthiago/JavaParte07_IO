package br.com.alura.java.io.teste;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class TesteManipularArquivo {
	@Test
	public void testeCriaArquivo() throws IOException {
		String diretorio = "C:/JavaIO"; // esta string funciona também com "C:\\JavaIO"
		String caminhoENomeArq = "C:/JavaIO/teste.txt"; // esta string funciona também com "C:\\JavaIO\\teste.txt" 
		
		// Primeiro é necessário cria o diretório caso não exista
		File dir = new File(diretorio);
		dir.mkdir();
		
		File file = new File(caminhoENomeArq);
		file.createNewFile();
		
		assertTrue(dir.exists());
		assertTrue(file.exists());
		
	}

	@Test
	public void testeCriaAquivoComFileWriter_EmDiretorioExistente() throws IOException {
		File file = new File("testeArquivoFileWriter.txt");
		if (file.exists()) {
			assertTrue("Deletou arquivo 'testeArquivoFileWriter.tx'", file.delete());
//			System.out.println("Deletou arquivo 'testeArquivoFileWriter.tx'");
		}
		
		FileWriter fileWriter = new FileWriter("testeArquivoFileWriter.txt");
//		fileWriter.write("Teste escrita linha 01 \n");
//		fileWriter.write("Teste escrita linha 02");
//		fileWriter.close();
		File file2 = new File("testeArquivoFileWriter.txt");
		assertTrue(file2.exists());
		
//		FileWriter fileWriter2 = new FileWriter("c:/JavaIO_2/testearq2.txt");
//		File file3 = new File("c:/JavaIO_2/testearq2.txt");
//		assertTrue(file3.exists());
	}
	@Test
	public void testeCriaAquivoComFileWriter_EmDiretorioInexistente() {
//		Deletar diretorio antes de criar
		
	}
}
