import java.util.Scanner;

public class EX_34 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Linhas: ");
		int n = entrada.nextInt();
		System.out.println("Colunas: ");
		int m = entrada.nextInt();
		
		int matriz[][] = new int [n][m];
		double media = 0;
		int contador = 0;
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < m; j++) {
				
				System.out.println("Elemento de posição " + i + j);
				matriz[i][j] = entrada.nextInt();
				if (matriz[i][j] > 0) {
					contador++;
					soma = soma + matriz[i][j];
				}
				
			}
			
		}
		
		media = ((double)soma / contador);
		
		System.out.println();
		System.out.println("Matriz: ");
		for (int vetor[] : matriz) {
			
			for (int item : vetor) {
				System.out.print(item + "\t");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Média dos elementos positivos da matriz: " + media);
		
		entrada.close();

	}

}
