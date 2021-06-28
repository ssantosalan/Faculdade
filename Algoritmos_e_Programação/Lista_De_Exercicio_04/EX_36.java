import java.util.Scanner;

public class EX_36 {

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
		System.out.println();
		
		for (int vetor[] : matriz) {

			for (int item : vetor) {
				System.out.print(item + "\t");

			}
			System.out.println();

		}
		System.out.println();

		
		if (n == m) { //P poder pegar a diagonal principal
			
			for (int i = 0; i < matriz.length; i++) {

				for (int j = 0; j < m; j++) {

					if (i == j) {
						System.out.print(matriz[i][i] + "\t");
					} else {
						System.out.print("x" + "\t");
					}
					

				}
				System.out.println();

			}
			
			
		} else {
			
			System.out.println("Não possui diagonal principal.");
			
		}
		
		

		entrada.close();

	}

}
