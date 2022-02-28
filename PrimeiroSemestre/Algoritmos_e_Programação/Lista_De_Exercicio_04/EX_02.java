
public class EX_02 {

	public static void main(String[] args) {
		int vetor[] = { 1, 2, 3, 4, 5, 6 };
		int soma = 0;
		for (int item : vetor) {
			soma = soma + item;
		}
		System.out.println("Soma de todos os elementos do vetor: " + soma);
	}

}
