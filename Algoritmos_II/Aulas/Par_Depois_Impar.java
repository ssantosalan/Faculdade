import java.util.Arrays;
/*
 * Considere um vetor com números pares e ímpares, 
 * reescreva o método bolha para colocar todos os números 
 * pares à frente no mesmo vetor e os ímpares ao final no mesmo vetor. 
 * Você não pode usar outro vetor como área auxiliar.
 * 
 * 
 */

public class Par_Depois_Impar {

	public static void parOuImpar(int[] v) {
		int aux = 0;

		for (int i = 0; i < v.length - 1; i++) {
			for (int j = 0; j < v.length - i - 1; j++) {
				if (v[j] % 2 == 1 && v[j + 1] % 2 == 0) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Vamos ordenar! Números pares à frente de ímpares!");
		int[] vetor = { 3, 1, 7, 2, 5, 8, 9, 6, 4 };
		System.out.println(Arrays.toString(vetor));
		parOuImpar(vetor);
		System.out.println(Arrays.toString(vetor));

	}

}
