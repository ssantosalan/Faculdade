import java.util.Scanner;

public class EX_06 {

	static double baskaraRaiz(double a, double b, double c, double d) {
		double baskaraRaiz = 0;

		// ax2 + bx + c
		// b² - 4 . a . b

		double delta = (b * b) - 4 * a * c;

		if (delta < 0) {
			baskaraRaiz = -1;

		} else if (delta == 0) {
			double x = ((-b) + Math.sqrt(delta)) / (2 * a);
			baskaraRaiz = x;

		} else if (delta > 0) {
			double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

			if (d == 1) {

				if (x1 > x2) { //maior raiz
					baskaraRaiz = x1;
				} else {
					baskaraRaiz = x2;
				}
				
			} else if (d == 2) { //menor raiz
				if (x1 < x2) {
					baskaraRaiz = x1;
				} else {
					baskaraRaiz = x2;
				}
			}

		}

		return baskaraRaiz;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("a: ");
		double a = entrada.nextInt();
		System.out.print("b: ");
		double b = entrada.nextInt();
		System.out.print("c: ");
		double c = entrada.nextInt();

		System.out.println("\nInforme qual raiz deseja encontrar: ");
		System.out.println("1 - Maior Raiz");
		System.out.println("2 - Menor Raiz");
		double d = entrada.nextDouble();

		double baskaraRaiz = baskaraRaiz(a, b, c, d);

		System.out.println("Maior raiz: " + baskaraRaiz);

		entrada.close();

	}

}
