
public class EX_14 {

	public static void main(String[] args) {
		int vetorA[] = { 1, 2, 3 };
		int vetorB[] = { 10, 20, 30 };
		int vetorC[] = new int[vetorA.length + vetorB.length];
		int contadorA = 0;
		int contadorB = 0;
		for (int i = 0; i < vetorC.length; i++) {

			if (i % 2 == 0) {
				vetorC[i] = vetorA[contadorA];
				contadorA++;
			} else {
				vetorC[i] = vetorB[contadorB];
				contadorB++;
			}

		}
		System.out.println("Vetor C:");
		for (int item : vetorC) {
			System.out.println(item);
		}

	}

}
