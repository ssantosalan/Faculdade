
public class Aula_08_resursao {

	public static void main(String[] args) {
		int[] v = {8, 6, 5, 1, 4, 3};
		int p = buscaLinearRecursiva(5, v, 0);
		int s = somaRecursiva(v, 0);
		System.out.println("Soma: " + s);
		System.out.println("Posição: " + p);
	}
	
	public static int somaRecursiva(int[] v, int i) {
		if (i == v.length)
			return 0;
		return v[i] + somaRecursiva(v, i + 1);
	}
	
	public static int buscaLinearRecursiva(int x, int[] v, int i) {
		if (i == v.length) {
			return -1;
		}
		
		if (v[i] == x) {
			return i;
		}
		
		return buscaLinearRecursiva(x, v, i + 1);
		
	}

}
