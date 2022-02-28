
public class AulaMatriz {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("Linha: %d \n", (i+1)); // matriz.length - retorna o número de linhas da matriz
			
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Matriz[%d][%d]: %d]: \n", i, j, matriz[i][j]); // matriz[i].length - retorna o número de colunas
			}
		}
	}

}
