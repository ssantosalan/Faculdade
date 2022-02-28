import java.util.Arrays;
/*
 * Considere um vetor com n�meros pares e �mpares, 
 * reescreva o m�todo bolha para colocar todos os n�meros 
 * pares � frente no mesmo vetor e os �mpares ao final no mesmo vetor. 
 * Voc� n�o pode usar outro vetor como �rea auxiliar.
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
		System.out.println("Vamos ordenar! N�meros pares � frente de �mpares!");
		int[] vetor = { 3, 1, 7, 2, 5, 8, 9, 6, 4 };
		System.out.println(Arrays.toString(vetor));
		parOuImpar(vetor);
		System.out.println(Arrays.toString(vetor));

	}

}
