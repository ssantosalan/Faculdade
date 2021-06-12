import java.util.Scanner;

public class EX_24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Linhas: ");
		int n = entrada.nextInt();

		System.out.println("Colunas: ");
		int m = entrada.nextInt();

		int matriz[][] = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {

				if (j % 2 == 1) {
					matriz[i][j] = 7;
				} else if (j % 2 == 0) {
					matriz[i][j] = 4;
				}

			}
	
		}
		
		System.out.println("Matriz: ");
		
		for (int[] vetor : matriz) {

			for (int item : vetor) {

				System.out.print(item + "\t");

			}
			System.out.println();

		}

		

		entrada.close();

	}

}
