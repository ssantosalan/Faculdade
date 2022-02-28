import java.util.Scanner;

public class EX_23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Número de linhas: ");
		int n = entrada.nextInt();
		
		System.out.print("Número de colunas: ");
		int m = entrada.nextInt();
		
		int matriz[][] = new int [n][m];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j <matriz.length; j++) {
				
				if (i % 2 == 1) {
					matriz[i][j] = 21;
				} else if (i % 2 == 0) {
					matriz[i][j] = 10;
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
