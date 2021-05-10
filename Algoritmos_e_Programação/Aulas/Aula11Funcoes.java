
public class Aula11Funcoes {
	static int minimo (int a, int b) {
		
		int min = 0;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}
	
	static void imprimi(int min) {
		System.out.println("Menor: " + min);
	}
	public static void main(String[] args) {
		
		int x = 11;
		int y = 6;
		int c = minimo(x, y);
		System.out.println("Mínimo: " + c);
		imprimi(c);
	}

}
