package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "ç";
		System.out.println("CodePoint: " + s.codePointAt(0)); // Código Unicode como resposta

		Charset defaultCharset = Charset.defaultCharset();
		System.out.println("Default charset (Encoding): " + defaultCharset.displayName());

//		byte[] bytesString = s.getBytes();
		byte[] bytesArrayString = s.getBytes("windows-1252");
		System.out.print("Quantidade de bytes: " + bytesArrayString.length + " <=> windows-1252, ");
		String sNovo = new String(bytesArrayString, "windows-1252");
		System.out.println(sNovo);

		bytesArrayString = s.getBytes("UTF-16");
		System.out.print("Quantidade de bytes: " + bytesArrayString.length + " <=> UTF-16, ");
//		sNovo = new String(bytesString, "windows-1252"); // Forçando erro
		sNovo = new String(bytesArrayString, "UTF-16"); 
		System.out.println(sNovo);

		bytesArrayString = s.getBytes(StandardCharsets.US_ASCII);
//		System.out.println("Quantidade de bytes: "+ bytesString.length + " " + StandardCharsets.US_ASCII.displayName());
		System.out.print("Quantidade de bytes: " + bytesArrayString.length + " " + "<=> US-ASCII, ");
//		sNovo = new String(bytesString, "windows-1252"); // Forçando erro
		sNovo = new String(bytesArrayString, "US-ASCII"); 
		System.out.println(sNovo);

//		bytesString = s.getBytes("UTF-8");
//		System.out.println("Quantidade de bytes: "+ bytesString.length + " - UTF-8");
	}
}
