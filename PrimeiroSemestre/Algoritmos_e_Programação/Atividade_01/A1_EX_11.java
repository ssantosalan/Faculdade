import java.util.Scanner;

public class A1_EX_11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N1, N2, N3, N4, SOMA;

		System.out.print("Digite o primeiro n�mero: ");
		N1 = teclado.nextInt();
		N1 = N1 * N1;

		System.out.print("Digite o segundo n�mero: ");
		N2 = teclado.nextInt();
		N2 = N2 * N2;

		System.out.print("Digite o terceiro n�mero: ");
		N3 = teclado.nextInt();
		N3 = N3 * N3;

		System.out.print("Digite o quarto n�mero: ");
		N4 = teclado.nextInt();
		N4 = N4 * N4;

		SOMA = N1 + N2 + N3 + N4;
		System.out.println("o resultado dos quadrados de cada n�mero somados � igual a: " + SOMA);
		
		teclado.close();

	}

}
