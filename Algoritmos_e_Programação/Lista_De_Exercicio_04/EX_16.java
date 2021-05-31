import java.util.Scanner;

public class EX_16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantidade de números: ");
		int n = entrada.nextInt();
		int vetor[] = new int[n];
		int contadorPar = 0;
		int contadorImpar = 0;

		int indicePar = 0;
		int indiceImpar = 0;
		int indiceValores = 0;

		for (int i = 0; i < n; i++) {
			int valor = entrada.nextInt();
			vetor[i] = valor;
		}

		for (int item : vetor) {
			if (item % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}

		int vetorPar[] = new int[contadorPar];
		int vetorImpar[] = new int[contadorImpar];

		System.out.println("Vetor antes de reordenar: ");
		for (int item : vetor) {

			if (item % 2 == 0) {
				vetorPar[indicePar] = item;
				indicePar++;
			} else {
				vetorImpar[indiceImpar] = item;
				indiceImpar++;
			}

			System.out.println(item);
		}

		// COLOCANDO OS NÚMEROS PARES
		for (int j = 0; j < vetorPar.length; j++) {
			vetor[indiceValores] = vetorPar[j];
			indiceValores++;
		}

		// COLOCANDO OS NÚMEROS IMPARES
		for (int j = 0; j < vetorImpar.length; j++) {
			vetor[indiceValores] = vetorImpar[j];
			indiceValores++;
		}

		System.out.println("Vetor reordenado: ");
		for (int item : vetor) {
			System.out.println(item);
		}

		entrada.close();

	}

}
