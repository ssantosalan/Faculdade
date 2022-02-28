import java.util.Scanner;

public class EX_06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 5;
		String nomeMaisVelho = "";
		String sexoMaisVelho = "";
		int idadeMaisVelho = 0;
		do {
			System.out.print("Nome: ");
			String nome = entrada.next();
			
			System.out.print("Idade: ");
			int idade = entrada.nextInt();
			
			System.out.print("Sexo: ");
			String sexo = entrada.next();
			
			if (idade > idadeMaisVelho) {
				nomeMaisVelho = nome;
				idadeMaisVelho = idade;
				sexoMaisVelho = sexo;
			}
			contador--;
		} while (contador > 0);
		
		System.out.println("Aluno mais velho:");
		System.out.println("Nome: " + nomeMaisVelho);
		System.out.println("Idade: " + idadeMaisVelho);
		System.out.println("Sexo: " + sexoMaisVelho);
		
		
		entrada.close();

	}

}
