import java.util.Scanner;

public class EX_17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A, B, C, D, somaCD, somaAB;

		System.out.print("Informe A: ");
		A = entrada.nextInt();

		System.out.print("Informe B: ");
		B = entrada.nextInt();

		System.out.print("Informe C: ");
		C = entrada.nextInt();

		System.out.print("Informe D: ");
		D = entrada.nextInt();

		somaCD = (C + D);
		somaAB = (A + B);

		if (B > C && D > A && somaCD > somaAB && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores não aceitos");
		}

		entrada.close();

	}

}
