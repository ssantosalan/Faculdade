import java.util.Scanner;

public class EX_22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Linhas matriz: ");
		int n = entrada.nextInt();
		
		System.out.println("Colunas matriz: ");
		int m = entrada.nextInt();
		
		int matriz[][] = new int [n][m];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = 20;
			}
			
		}
		
		System.out.println("Matriz: ");
		
		for (int[] vetor: matriz) {
			for (int item : vetor) {
				System.out.print(item + "\t");
			}
			System.out.println();
		}
		
		
		
		entrada.close();
		

	}

}
