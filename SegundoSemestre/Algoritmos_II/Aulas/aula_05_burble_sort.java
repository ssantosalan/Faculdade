import java.util.Arrays;

public class aula_05_burble_sort {

	public static void bubbleSort(int[] v) {
		int aux = 0;
		// Fase de Ordenação
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = 0; j < v.length - i - 1; j++) {
				if (v[j] > v[j+1]) {
					aux = v[j]; 
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Vamos ordenar!");
		int[] vetor = { 17, 8, 23, 32, 51 };
		System.out.println(Arrays.toString(vetor));
		bubbleSort(vetor);
		System.out.println(Arrays.toString(vetor));

	}

}
