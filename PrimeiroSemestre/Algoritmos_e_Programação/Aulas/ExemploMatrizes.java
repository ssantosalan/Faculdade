import java.util.Scanner;

public class ExemploMatrizes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] m = new int[2][4];

		for (int i = 0; i < 2; i++) {
			System.out.println("Informe os elementos da linhas " + (i + 1) + ":");
			for (int j = 0; j < 4; j++) {
				System.out.println("Coluna " + (j + 1) + ": ");
				m[i][j] = entrada.nextInt();
			}

		}
		for (int i = 0; i < 2; i++) {
			System.out.println("Linha" + (i + 1) + ":");
			for (int j = 0; j < 4; j++) {
				System.out.println("Coluna " + (j + 1) + ": " + m[i][j]);
			}
		}

	}

}
