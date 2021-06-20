import java.util.Scanner;

public class EX_30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Linhas: ");
		int n = entrada.nextInt();
		System.out.println("Colunas: ");
		int m = entrada.nextInt();

		int matriz[][] = new int[n][m];

		int vetor[] = new int[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Elemento de posição " + i + " do vetor: ");
			vetor[i] = entrada.nextInt();

		}
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < m; j++) {

				matriz[i][j] = vetor[i];

			}

		}

		System.out.println("Matriz: ");
		for (int vetorMatriz[] : matriz) {

			for (int item : vetorMatriz) {
				System.out.print(item + "\t");
			}
			System.out.println();

		}

		entrada.close();

	}

}
