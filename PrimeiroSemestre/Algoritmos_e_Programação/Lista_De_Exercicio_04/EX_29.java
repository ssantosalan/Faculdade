import java.util.Scanner;

public class EX_29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Linha: ");
		int n = entrada.nextInt();
		System.out.println("Coluna: ");
		int m = entrada.nextInt();
		
		int matriz[][] = new int [n][m];
				
		//System.out.println("Vetor de quantos elementos?");
		//int elementos = entrada.nextInt();
		int vetor[] = new int [m];
		
		for (int i = 0; i < vetor.length; i++) {
			
			vetor[i] = entrada.nextInt();
			
		}
		System.out.println();
		for (int item : vetor) {

			System.out.print(item + "\t");
		}
		
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < m; j++) {
				
				matriz[i][j] = vetor[j];
				
			}
			
		}
		
		
		
		for (int vetorMatriz[] : matriz) {
			
			for (int item : vetorMatriz) {
				System.out.print(item + "\t");
			}
			System.out.println();
		}
		
		entrada.close();

	}

}
