import java.util.Scanner;

public class Recursividade_EX03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("informe 'a': ");
		double a = entrada.nextDouble();
		System.out.print("informe 'n': ");
		double n = entrada.nextDouble();

		double rec = potencia(a, n);
		System.out.println(rec);
	}

	public static double potencia(double a, double n) {

		if (n == 0) {
			return 1;
		}
		return a * potencia(a, n - 1);

	}

}
