package quarto;

import java.util.Scanner;

public class EX_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		
		String nome = entrada.next();
		
		System.out.println("O nome tem " + nome.length() + " letras");
	}

}
