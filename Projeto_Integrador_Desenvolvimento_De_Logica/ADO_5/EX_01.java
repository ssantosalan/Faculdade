import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		Boolean tacerto = false;

		do {
			System.out.println("1 - Instruções");
			System.out.println("2 - Jogar");
			System.out.println("3 - Créditos");
			System.out.println("4 - Sair");

			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				tacerto = false;
				System.out.println(
						"Instruções: para realizar uma ação, escreva no console de texto. Por exemplo: andar para o sul.");
				break;
			case 2:
				tacerto = false;
				System.out.println("O jogo não pode ser executado no momento.");
				break;
			case 3:
				tacerto = false;
				System.out.println("Roteiro por Alan Siva dos Santos");
				System.out.println("Motor gráfico por Alan Silva dos Santos");
				System.out.println("Revisão por Alan Silva dos Santos");
				System.out.println("Obrigado!");
				break;
			case 4:
				tacerto = true;
				System.out.println("Jogo finalizado.");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente");
			}

		} while (!tacerto);

		entrada.close();

	}

}
