import java.util.Random;
import java.util.Scanner;

public class ADO_11 {

	public static void embaralhar(int vetor[]) {

		Random random = new Random();

		for (int i = 0; i < (vetor.length - 1); i++) {

			// sorteia um índice
			int j = random.nextInt(vetor.length);

			// troca o conteúdo dos índices i e j do vetor
			int temp = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = temp;

		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vida = 1;
		int escolha;
		int pontuacao = 0;
		int n;
		
		do {
			System.out.print("Digite o tamanho do caminho: ");
			n = entrada.nextInt();
		} while (n <= 0);
		int vetor[] = new int[n];
		int quantidade_bomba;

		do {
			System.out.print("Digite o número de bombas: ");
			quantidade_bomba = entrada.nextInt();
		} while (quantidade_bomba <= 0);

		int pontuacaoMaxima = n - quantidade_bomba;

		for (int i = 0; i < vetor.length; i++) {

			if (quantidade_bomba > 0) {
				vetor[i] = -1;
				quantidade_bomba--;
			} else {
				vetor[i] = 0;
			}

		}

		System.out.println();
		// embaralha o array
		embaralhar(vetor);

		while (vida > 0) {
			for (int item : vetor) {

				if (item == 0 || item == -1) {
					System.out.print(" _ ");
				} else if (item == 1) {
					System.out.print(" x ");
				}
			}

			System.out.println();
			for (int i = 0; i < vetor.length; i++) {
				System.out.print("[" + i + "]");

			}

			do {
				System.out.println();
				System.out.print("Informe o caminho: ");
				escolha = entrada.nextInt();

				if (vetor[escolha] == -1) {
					System.out.println();
					for (int item : vetor) {

						if (item == 0) {
							System.out.print(" _ ");
						} else if (item == 1) {
							System.out.print(" x ");
						} else if (item == -1) {
							System.out.print(" b ");
						}
					}
					System.out.println();
					for (int i = 0; i < vetor.length; i++) {
						System.out.print("[" + i + "]");
					}
					System.out.println();
					System.out.println("Fim de jogo!");
					System.out.println("Pontuação: " + pontuacao + "/" + pontuacaoMaxima);
					vida--;
					System.exit(0);
				} else if (vetor[escolha] == 1) {
					System.out.println("Caminho já escolhido!");
				}

			} while (vetor[escolha] == 1);

			if (vetor[escolha] == 0) {
				pontuacao++;

				if (escolha != 0 && escolha != n - 1) {
					if (vetor[escolha + 1] == -1 || vetor[escolha - 1] == -1) {
						System.out.println("Cuidado: bomba próxima!");
					}
				}

			}

			if (pontuacao == pontuacaoMaxima) {
				System.out.println();
				vetor[escolha] = 1;
				for (int item : vetor) {

					if (item == 0) {
						System.out.print(" _ ");
					} else if (item == 1) {
						System.out.print(" x ");
					} else if (item == -1) {
						System.out.print(" b ");
					}
				}
				System.out.println();
				for (int i = 0; i < vetor.length; i++) {
					System.out.print("[" + i + "]");
				}
				System.out.println();
				System.out.println();
				System.out.println("Parabéns, você ganhou o jogo!");
				System.out.println("Pontuação: " + pontuacao + "/" + pontuacaoMaxima);
				System.exit(0);
			}

			vetor[escolha] = 1;
		}

		entrada.close();

	}

}
