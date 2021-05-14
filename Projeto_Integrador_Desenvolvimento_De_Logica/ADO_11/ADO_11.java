import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ADO_11 {

	// método que embalha os elementos de um vetor de inteiros
	public static void embaralhar(int vetor[]) {

		Random random = new Random();

		for (int i = 0; i < (vetor.length - 1); i++) {

			// sorteia um índice
			int j = random.nextInt(vetor.length);

			// troc ao conteúdo dos índices i e j do vetor
			int temp = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = temp;

		}

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String bomba = "b";
		String espaco_marcado = "x";
		String espaco_livre = "_";

		System.out.print("Digite o tamanho do caminho: ");
		int n = entrada.nextInt();
		int vetor[] = new int[n];
		int contador = n;
		
		System.out.print("Digite o número de bombas: ");
		int quantidade_bomba = entrada.nextInt();
		System.out.println();

		
		for (int i = 0; i < vetor.length; i++) {

			// System.out.print("[" + i + "]");
			
			
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
		
		
		
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] == -1) 
			
			/*
			do { 
				System.out.print(" _ ");
				contador--;
			} while (contador > 0);
			*/
			System.out.println();
			for (i = 0; i < vetor.length; i++) {

				System.out.print("[" + i + "]");

			}
			System.out.println();
			System.out.print("Informe uma posição: ");

		}

		// System.out.println("Antes");
		/*
		 * for (int i = 0; i < vetor.length; i++) {
		 * 
		 * if (bomba > 0) { vetor[i] = -1; bomba--; } else { vetor[i] = 0; }
		 * //System.out.println(vetor[i]); }
		 */

		/*
		 * // imprime o conteúdo do array (depois de embaralhado)
		 * System.out.println("Depois de embaralhar: "); for (int i = 0; i <
		 * vetor.length; i++) { System.out.println(vetor[i]); }
		 */

		entrada.close();

	}

}
