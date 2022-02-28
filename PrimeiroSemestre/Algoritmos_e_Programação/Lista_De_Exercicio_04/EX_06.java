
public class EX_06 {

	public static void main(String[] args) {
		int vetor[] = { 1, 2, 3};
		int produto = 1;
		for (int item : vetor) {
			
			produto = produto * item;
		}
		
		System.out.println("Produto: " + produto);
	}

}
