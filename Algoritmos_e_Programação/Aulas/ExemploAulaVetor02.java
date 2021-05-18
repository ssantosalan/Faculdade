import java.util.Scanner;

public class ExemploAulaVetor02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int n = 10;
		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = leitor.nextInt();
		}

		int soma = 0;
		int menor = vetor[0];
		int maior = vetor[0];

		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
			if (vetor[i] < menor) {
				menor = vetor[i];

			}
			if (vetor[i] > maior) {
				maior = vetor[i];
			}

		}

		for (int i = 0; i < n; i++) {
			System.out.println("vetor[" + i + "]:" + vetor[i]);
			if (vetor[i] == menor) {
				System.out.print("<-- menor");

			} else if (vetor[i] == maior) {
				System.out.print("<-- maior");
			}
			System.out.println("\n");
		}
		System.out.println("Soma: " + soma);
	}

}
