import java.util.Arrays;
import java.util.Scanner;

public class EX_18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println();
		System.out.print("\nInforme um número: ");
		int n = entrada.nextInt();
		int posicao = Arrays.binarySearch(vetor, n);
		
		System.out.println("Encontrei o valor na posição " + posicao);
		entrada.close();
	}

}
