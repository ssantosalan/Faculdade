
public class Aula_02_Ex_3 {

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, };
		imprimir(m);
		int traco = calcularTraco(m);
		System.out.println("Traco: " + traco);
	}

	public static int calcularTraco(int[][] m) {
		int soma = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == j) {
					soma += m[i][j];
				}
			}
		}
		return soma;
	}

	public static void imprimir(int[][] m) {

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {

				System.out.print(m[i][j] + " ");

			}

			System.out.println();
		}

	}

}
