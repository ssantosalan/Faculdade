
public class EX_12 {

	public static void main(String[] args) {
		int vetorA[] = { 1, 2, 3 };
		int vetorB[] = { 4, 5, 6 };
		int somaA = 0;
		int somaB = 0;
		double mediaA = 0;
		double mediaB = 0;
		int contador = 0;
		for (int item : vetorA) {
			somaA = somaA + item;
			contador++;
		}
		mediaA = (somaA / contador);
		contador = 0;

		for (int item : vetorB) {
			somaB = somaB + item;
			contador++;
		}
		mediaB = (somaB / contador);

		if (somaA >= somaB) {
			System.out.println("Maior soma: " + somaA);
		} else {
			System.out.println("Maior soma: " + somaB);
		}

		if (mediaA <= mediaB) {
			System.out.println("Menor média: " + mediaA);
		} else {
			System.out.println("Menor média: " + mediaB);
		}

	}

}
