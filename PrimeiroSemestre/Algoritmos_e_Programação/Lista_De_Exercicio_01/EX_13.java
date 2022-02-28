import java.util.Scanner;

public class EX_13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1, N2, N3;

		System.out.print("Informe o primeiro número: ");
		N1 = entrada.nextInt();

		System.out.print("Informe o segundo número: ");
		N2 = entrada.nextInt();

		System.out.print("Informe o terceiro número: ");
		N3 = entrada.nextInt();

		if ((N1 > N2) && (N1 > N3)) {
			System.out.println("O maior número é: " + N1);
		} else if ((N2 > N1) && (N2 > N3)) {
			System.out.println("O maior número é: " + N2);
		} else {
			System.out.println("O maior número é: " + N3);
		}

		entrada.close();

	}

}
