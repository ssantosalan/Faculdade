import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		Boolean tacerto = false;

		do {
			System.out.println("1 - Instru��es");
			System.out.println("2 - Jogar");
			System.out.println("3 - Cr�ditos");
			System.out.println("4 - Sair");

			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(
						"Instru��es: para realizar uma a��o, escreva no console de texto. Por exemplo: andar para o sul.");
				break;
			case 2:
				System.out.println("O jogo n�o pode ser executado no momento.");
				break;
			case 3:
				System.out.println("Roteiro por Alan Siva dos Santos");
				System.out.println("Motor gr�fico por Alan Silva dos Santos");
				System.out.println("Revis�o por Alan Silva dos Santos");
				System.out.println("Obrigado!");
				break;
			case 4:
				tacerto = true;
				System.out.println("Jogo finalizado.");
				break;
			default:
				System.out.println("Op��o inv�lida! Tente novamente");
			}

		} while (!tacerto);

		entrada.close();

	}

}
