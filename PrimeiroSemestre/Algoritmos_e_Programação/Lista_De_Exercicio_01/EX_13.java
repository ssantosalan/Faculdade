import java.util.Scanner;

public class EX_13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1, N2, N3;

		System.out.print("Informe o primeiro n�mero: ");
		N1 = entrada.nextInt();

		System.out.print("Informe o segundo n�mero: ");
		N2 = entrada.nextInt();

		System.out.print("Informe o terceiro n�mero: ");
		N3 = entrada.nextInt();

		if ((N1 > N2) && (N1 > N3)) {
			System.out.println("O maior n�mero �: " + N1);
		} else if ((N2 > N1) && (N2 > N3)) {
			System.out.println("O maior n�mero �: " + N2);
		} else {
			System.out.println("O maior n�mero �: " + N3);
		}

		entrada.close();

	}

}
