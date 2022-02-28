import java.util.Random;
import java.util.Scanner;

import java.util.Arrays;

public class Aula_04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] vetor = gerarVetor();
		Arrays.sort(vetor);
		System.out.println(Arrays.toString(vetor));
		System.out.println("número: ");
		int valor = leitor.nextInt();
		int p = buscaBinaria(vetor, valor);
		
		if ( p >= 0) {
			System.out.println("Valor encontrado na posição: " + p);
		}
		else {
			System.out.println("Valor não encontrado.");
		}
	}
	
	
	
	public static int[] gerarVetor() {
		Random r = new Random();
		int []v = new int[100];
		for (int i = 0; i < v.length; i++) {
			v[i] = r.nextInt(1000);
		}
		return v;
	}

	public static int buscaBinaria(int[] v, int x) {
		int i = 0;
		int f = v.length - 1;
		int m;
		while (i <= f) {
			m = (i + f) / 2;
			if (x == v[m])
				return m;
			if (x < v[m])
				f = m - 1;
			else
				i = m + 1;
		}
		return -1;
	}

}
