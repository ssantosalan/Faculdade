
public class EX_11 {

	public static void main(String[] args) {
		int vetor[] = {1, 2, 3, 4, 5, 6};
		double media;
		double soma = 0;
		int contador = 0;
		for (int i = 0; i < vetor.length; i++) {
			
			if (i % 2 == 0) {
				soma = soma + vetor[i];
				contador++;
			}
		
		}
		
		media = (soma / contador); 
		System.out.println("Média dos valores de índice par: " + media);
		System.out.println("\nValores no vetor que são maiores que a média de índice par: ");
		for (int item: vetor) {
			if (item > media) {
				System.out.println(item);
			}
		}
		
	}

}
