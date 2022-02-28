import java.util.Scanner;

public class EX_01 {

	static int menor(int a, int b, int c) {
		int menorNumero = 0;

		if (a <= b && a <= c) {
			menorNumero = a;
		} else if (b <= a && b <= c) {
			menorNumero = b;
		} else if (c <= a && c <= b) {
			menorNumero = c;
		}

		return menorNumero;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		menor(a, b, c);
		int menorNumero = menor(a, b, c);
		
		System.out.println("Menor número: " + menorNumero);
		entrada.close();

	}

}
