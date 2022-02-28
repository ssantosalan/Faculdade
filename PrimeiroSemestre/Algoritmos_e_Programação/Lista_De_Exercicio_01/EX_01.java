import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1, N2, produto;

		System.out.print("Digite o primeiro número: ");
		N1 = entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		N2 = entrada.nextInt();

		produto = (N1 * N2);

		System.out.print("O produto destes dois números é igual a: " + produto);

		entrada.close();

	}

}
