
public class EX_04 {

	public static void main(String[] args) {
		int vetor[] = {1, 2, 3, 4};
		
		int menor = vetor[0];
		
		for (int item : vetor) {
			
			if (item < menor) {
				menor = item;
			}
		}
		System.out.println("Menor: " + menor);

	}

}
