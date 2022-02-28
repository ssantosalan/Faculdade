
public class EX_07 {

	public static void main(String[] args) {
		int vetor [] = {1, 2, 3};
		int n = 2;
		int produto = 0;
		
		for (int item : vetor) {
			
			produto = produto + (n * item);
		}

		System.out.println("Resultado: " + produto);
	}

}
