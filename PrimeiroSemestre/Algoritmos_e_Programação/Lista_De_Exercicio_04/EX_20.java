
public class EX_20 {

	public static void main(String[] args) {
		int vetor[] = { 1, 2, 3, 4, 5, 6 };
		int contadorMultiploDeTres = 0;

		for (int item : vetor) {
			if (item % 3 == 0) {
				contadorMultiploDeTres++;
			}
		}
		int[] vetorMultiploDeTres = new int[contadorMultiploDeTres];

		int k = 0;
		for (int item : vetor) {

			if (item % 3 == 0) {
				vetorMultiploDeTres[k] = item;
				k++;
			}
		}
		System.out.println("Vetor Multiplo de Três: ");
		for (int item : vetorMultiploDeTres) {
			System.out.println(item);
		}
		System.out.println("Elementos nas posições ímpares desse vetor (começando na posição 1, que corresponde à posição 0 em Java): ");
		int posicaoImpar = 1;
		for (int i = 0; i < vetorMultiploDeTres.length; i++) {
			
			if (posicaoImpar % 2 == 1) {
				System.out.println(vetorMultiploDeTres[i]);
				posicaoImpar++;
			}
		}
		
	}

}
