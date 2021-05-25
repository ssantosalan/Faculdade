
public class ExemploMatrizes02 {

	public static void main(String[] args) {
		int n = 6;
		int[][] m = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) { // diagonal principal
					m[i][j] = 0;
				} else if ((i + j) == (n - 1)) {// diagonal secundária
					m[i][j] = 1;
				} else
					m[i][j] = 2;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
