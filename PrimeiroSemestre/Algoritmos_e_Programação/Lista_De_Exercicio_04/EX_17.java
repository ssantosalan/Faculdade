
public class EX_17 {

	public static void main(String[] args) {
		int vetor[] = {1, 2, 3}; //vetor de números reais
		int n = 2;				//número real
		int produto = 0;
		System.out.println("Produto: ");
		for (int item : vetor) {
			produto = item * n;
			System.out.println(produto);
		}

	}

}
