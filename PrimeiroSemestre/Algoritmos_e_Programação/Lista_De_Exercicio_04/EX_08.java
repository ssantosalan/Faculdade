
public class EX_08 {

	public static void main(String[] args) {
		int vetor [] = {1, 2, 3};
		int n = 2;
		boolean estaPresente = false;
		for (int item : vetor) {
			
			if (item == n) {
				estaPresente = true;
			}
		}
		System.out.println(estaPresente);
	}

}
