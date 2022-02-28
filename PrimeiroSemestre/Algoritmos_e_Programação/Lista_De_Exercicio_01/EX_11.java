import java.util.Scanner;

public class EX_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N;

		System.out.print("Informe um número: ");
		N = entrada.nextInt();

		if (N < 0) {
			System.out.println("Número negativo");
		}

		entrada.close();

	}

}
