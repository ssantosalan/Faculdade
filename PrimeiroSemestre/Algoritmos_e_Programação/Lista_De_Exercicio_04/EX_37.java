import java.util.Scanner;

public class EX_37 {

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
		
		int somaColuna = 0;
		int contadorLinha = 0;

		for (int i = 0; i < matriz.length; i++) {
			
			int somaLinha = 0;
			
			for (int j = 0; j < m; j++) {

				somaLinha = somaLinha + matriz[i][j];
				
						
			}
			
			if (somaLinha == 0) {
				contadorLinha++;
			}
			
			
			
		}
		
		System.out.println("Número de linhas nulas: " + contadorLinha);
		
		
				
		
		entrada.close();

	}

}
