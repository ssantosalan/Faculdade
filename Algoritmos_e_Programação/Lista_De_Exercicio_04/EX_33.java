import java.util.Scanner;

public class EX_33 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Linhas: ");
		int n = entrada.nextInt();
		System.out.println("Colunas: ");
		int m = entrada.nextInt();

		int matriz[][] = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < m; j++) {
				System.out.println("Elemento de posição " + i + j);
				matriz[i][j] = entrada.nextInt();
			}

		}

		for (int vetor[] : matriz) {
			for (int item : vetor) {
				System.out.print(item + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Posições dos elementos negativos da matriz: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < m; j++) {
				if (matriz[i][j] < 0) {
					System.out.println("Posição: " + i + j);

				}
			}
		}

		entrada.close();

	}

}
