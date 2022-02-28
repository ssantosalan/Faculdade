import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedReader;

public class ADO_01 {

	public static void main(String[] args) throws Exception {
	    String s = lerTexto("texto.txt");
	    System.out.println(s);
	    
	}
	
	public static String lerTexto(String nomeArquivo) throws Exception {
		StringBuilder sb = new StringBuilder();
		FileReader arquivo = new FileReader(nomeArquivo);
		BufferedReader leitor = new BufferedReader(arquivo);
		String linha;
		while ((linha = leitor.readLine()) != null) {
			sb.append(linha);
			sb.append("\n");
		}
		leitor.close();
		return sb.toString();
	}

}