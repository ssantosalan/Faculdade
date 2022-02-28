import java.util.Scanner;

public class ExemploMatrizesFuncoes {

	static Scanner input = new Scanner(System.in);

	static int[] tamanhoMatriz() {
		System.out.println("*-TamanhoMatriz-*");
		int[] vetor = new int[2];
		System.out.println("Linhas: ");
		vetor[0] = input.nextInt();
		System.out.println("Coluna: ");
		vetor[1] = input.nextInt();
		return vetor; // Linhas e colunas

	}

	static int[][] criaMatriz(int[] v) {
		System.out.println("*-CriaMatriz-*");
		int[][] matriz = new int[v[0]][v[1]];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Matriz[%d][%d]: \n", i, j);
				matriz[i][j] = input.nextInt();
			}
		}
		return matriz;
	}

	static int obterNumero() {
		System.out.println("*-obterNumero-*");
		int n;
		System.out.println("Número: ");
		n = input.nextInt();
		return n;
	}

	static int verificaOcorrencias(int[][] m, int n) {
		System.out.println("*-Verificar Ocorrências-*");
		int cont = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == n) {
					cont++;
				}
			}

		}
		return cont;
	}

	static int[][] obterIndices(int[][] m, int cont, int n) {
		System.out.println("*-Obter Índices-*");
		int[][] mP = new int[cont][2];
		int iL = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == n) {
					mP[iL][0] = i;
					mP[iL][1] = j;
					iL++;
				}
			}
		}
		return mP;
	}

	static void imprimeIndices(int[][] mP) {
		System.out.println("*-Imprime Índices-*");
		for (int i = 0; i < mP.length; i++) {
			System.out.printf("[%d][%d] \n", mP[i][0], mP[i][1]);
		}

	}

	public static void main(String[] args) {
		int[] v = tamanhoMatriz();
		int[][] m = criaMatriz(v);
		int n = obterNumero();
		int c = verificaOcorrencias(m, n);
		System.out.println("R: " + c);
		int[][] mP = obterIndices(m, c, n); 
		imprimeIndices(mP);

	}

}
