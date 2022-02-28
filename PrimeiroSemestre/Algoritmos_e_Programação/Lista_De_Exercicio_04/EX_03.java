
public class EX_03 {

	public static void main(String[] args) {
		int vetor[] = { -1, -2, -3, -4, -5, -6 };
		int maior = 0;
		maior = vetor[0];
		for (int item : vetor) {
			if (item > maior) {
				maior = item;
			}
		}
		System.out.println("Maior: " + maior);

	}

}
