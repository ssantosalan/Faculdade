/*
Temos triângulos feito de blocos. A linha superior tem 1 bloco, a próxima linha abaixo tem 2 blocos, a
próxima linha tem 3 blocos e assim por diante. Criar uma função recursiva que calcule (sem loops ou multiplicação)
o número total de blocos em um triângulo com o número especificado de linhas.
*/
public class EX_05 {

	public static void main(String[] args) {
		
	System.out.println(recursividadeBlocosTriangulo(5));		
	}
	
	public static int recursividadeBlocosTriangulo (int n) {
		
		if (n == 0) return 0;
		
		if (n == 1) return 1;
		
		return recursividadeBlocosTriangulo(n - 1) + n;
		
	}

}
