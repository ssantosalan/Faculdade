
import java.util.Scanner;

public class Exercicio_aula_01 {

	public static void inverta (int[] v) {

		for (int i = 0; i < v.length / 2; i++) {
			int aux = v[i];
			v[i] = v[v.length - 1 - i];
			v[v.length - 1 - i] = aux;
		}

	}

	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {

			System.out.println(v[i] + " ");

		}
		System.out.println();

	}

	public static void main(String[] args) {


		int[] v = { 3, 8, 7, 5, 4, 6, 2 };
		imprimir(v);
		inverta(v);
		System.out.println();
		imprimir(v);

	}

}
