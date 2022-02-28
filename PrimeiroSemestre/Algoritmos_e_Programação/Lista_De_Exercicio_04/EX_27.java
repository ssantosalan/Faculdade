import java.util.Scanner;

public class EX_27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		int m = entrada.nextInt();
		int matriz[][] = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < m; j++) {

				matriz[i][j] = i + j;

			}

		}

		for (int vetor[] : matriz) {

			for (int item : vetor) {

				System.out.print(item + "\t");

			}
			System.out.println();

		}

		entrada.close();

	}

}
