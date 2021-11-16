/*
Temos tri�ngulos feito de blocos. A linha superior tem 1 bloco, a pr�xima linha abaixo tem 2 blocos, a
pr�xima linha tem 3 blocos e assim por diante. Criar uma fun��o recursiva que calcule (sem loops ou multiplica��o)
o n�mero total de blocos em um tri�ngulo com o n�mero especificado de linhas.
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
