
public class EX_19 {

	public static void main(String[] args) {
		int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int contadorImpar = 1;

		for (int i = 0; i < vetor.length; i++) {

			if (contadorImpar % 2 == 1) {

				System.out.printf("[%d]", vetor[i]);
			}
			contadorImpar++;

		}

	}

}
