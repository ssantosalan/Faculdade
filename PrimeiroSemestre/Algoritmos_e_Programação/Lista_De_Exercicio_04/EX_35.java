import java.util.Scanner;

public class EX_35 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Linhas: ");
		int n = entrada.nextInt();
		System.out.println("Colunas: ");
		int m = entrada.nextInt();
		
		int matriz[][] = new int [n][m];
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < m; j++) {
				
				System.out.println("Elemento de posição " + i + j);
				matriz[i][j] = entrada.nextInt();
				
				if (matriz[i][j] > 0) {
					
					soma = soma + matriz[i][j];
					
				}
				
				
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
		System.out.println("Soma dos elementos positivos da matriz: " + soma);
		
		
		entrada.close();

	}

}
