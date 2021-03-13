import java.util.Scanner;

public class EX_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1, N2, SOMA;

		System.out.print("Digite o primeiro valor: ");
		N1 = entrada.nextInt();
		N1 = (N1 * N1);

		System.out.print("Digite o segundo valor: ");
		N2 = entrada.nextInt();
		N2 = (N2 * N2);

		SOMA = (N1 + N2);

		System.out.print("A soma dos quadrados desses dois números é igual a: " + SOMA);

		entrada.close();

	}

}
