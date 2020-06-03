package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bhyte.bank.herdado.Cliente;

public class TesteSerealizacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Dev");	
		cliente.setCpf("234113131");
		
		String nome = "Angelo";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		System.out.println("Fim da gravação");

//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		cliente = (Cliente) ois.readObject();
//		System.out.println(cliente.getNome());
//		System.out.println(cliente.getCpf());
	}

}
