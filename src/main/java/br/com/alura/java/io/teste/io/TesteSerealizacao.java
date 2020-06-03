package br.com.alura.java.io.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.invoke.ConstantCallSite;

import bhyte.bank.herdado.Cliente;
import bhyte.bank.herdado.ContaCorrente;

public class TesteSerealizacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Dev");
		cliente.setCpf("234113131");

		ContaCorrente cc = new ContaCorrente(222,333);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		String nome = "Angelo";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		System.out.println("Fim da gravação");
	}
}
