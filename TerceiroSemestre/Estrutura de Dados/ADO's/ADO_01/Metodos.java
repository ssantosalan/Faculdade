package ADO01;

public class Metodos {
	private static Livro[] lista = new Livro[3];
	private static int n = 0;

	public static void main(String[] args) {

	}

	public static Livro inserirObjetos(Livro[] livro) {
		if (n == lista.length)
			lista = alocarNovoArray();

		Livro novo = new Livro();
		return novo;
	}

	public static void removerObjeto(Livro[] livro) {

	}

	public static Livro[] alocarNovoArray() {
		Livro[] novo = new Livro[lista.length + 3];
		System.arraycopy(lista, 0, novo, 0, lista.length);
		return novo;
	}

	public static void remover(int id) {
		for (int i = id; i < n - 1; i++) {
			lista[i] = lista[i + 1];
		}
	}

	private static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}

}
