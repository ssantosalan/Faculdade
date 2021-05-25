import java.util.Scanner;

public class EX_05 {

	static double baskaraMaiorRaiz(double a, double b, double c) {
		double baskaraMaiorRaiz = 0;

		// ax2 + bx + c]
		// b² - 4 . a . b

		double delta = (b * b) - 4 * a * c;

		if (delta < 0) {
			baskaraMaiorRaiz = -1;
			
		} else if (delta == 0) {
			double x = ((-b) + Math.sqrt(delta)) / (2 * a);
			baskaraMaiorRaiz = x;

		} else if (delta > 0) {
			double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

			if (x1 > x2) {
				baskaraMaiorRaiz = x1;
			} else {
				baskaraMaiorRaiz = x2;
			}

		}

		return baskaraMaiorRaiz;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("a: ");
		double a = entrada.nextInt();
		System.out.print("b: ");
		double b = entrada.nextInt();
		System.out.print("c: ");
		double c = entrada.nextInt();

		double baskaraMaiorRaiz = baskaraMaiorRaiz(a, b, c);

		System.out.println("Maior raiz: " + baskaraMaiorRaiz);

		entrada.close();

	}

}
