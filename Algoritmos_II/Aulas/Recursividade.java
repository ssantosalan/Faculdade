
public class Recursividade {

	public static void main(String[] args) {
		int f = fatorial(5);
		System.out.println("Resultado = " + f);
	}
	
	public static int fatorial(int n) {
		if (n == 0) {
			return 1;
		}
		int f = fatorial(n - 1);
		int r = n * f;
		return r;
	} 

}
