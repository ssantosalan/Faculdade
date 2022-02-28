import java.util.Scanner;
import java.util.Random;

public class ADO_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random dado = new Random();
		double a = 0;
		double b = 0;
		System.out.print("Valor mínimo: ");
		int menor = sc.nextInt();
		System.out.print("Valor máximo: ");
		int maior = sc.nextInt();

		do {
			a = dado.nextInt((maior - menor) + 1) + menor;
			b = dado.nextInt((maior - menor) + 1) + menor;
		} while (a == 0);

		System.out.println("Equação: ax + b = 0. Sendo a = " + a + ", b = " + b);
		double x = -b / a;

		System.out.println("x = " + x);

		sc.close();

	}

}