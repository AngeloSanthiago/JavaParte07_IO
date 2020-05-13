package br.com.alura.java.io.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Propriedades {

	public static void main(String[] args) throws IOException {
		Propriedades prop_teste = new Propriedades();
		
//		prop_teste.gravaAquivoPropriedades(new Properties());
		
		prop_teste.leArquivoPropriedades(new Properties());
		
		
	}


	private void gravaAquivoPropriedades(Properties props) throws IOException {
		props.setProperty("login", "alura");
//		props.setProperty("login", "alura2"); Se a chave for duplicada a gravação mais recente permanece
		props.setProperty("senha", "alurapass");
		props.setProperty("endereço", "www.alura.com.br");

		props.store(new FileWriter("conf.properties"), "teste de gravação");
	}

	public void leArquivoPropriedades(Properties props) throws FileNotFoundException, IOException {
		props.load(new FileReader("conf.properties"));
		String valorLogin = props.getProperty("login"); // pega o valor da última chave casa exista mais de uma
		String valorSenha = props.getProperty("senha");
		String valorEndereco = props.getProperty("endereço");
		System.out.format("Login: %s - Senha: %s - Endereço: %s", valorLogin, valorSenha, valorEndereco);
	}
}
