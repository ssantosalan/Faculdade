
public class EX_09 {

	public static void main(String[] args) {
		int vetorA[] = { 1, 2, 3 };
		int vetorB[] = { 4, 5, 6 };
		int vetorC[] = { 0, 0, 0};
		int produto = 1;
		
		for (int i = 0; i < vetorA.length; i++) {
			
			produto = (vetorA[i] * vetorB[i]);
			System.out.println("Produto na posição " + i + ": " + produto);
			vetorC[i] = produto;
		}
		System.out.println("\nVetor C: ");
		for (int item : vetorC) {
			System.out.println(item);
		}
		
		
		
		
	}

}
