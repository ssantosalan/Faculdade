import java.util.Scanner;

public class A1_EX_09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1, N2, soma;

		System.out.print("Digite o primeiro número: ");
		N1 = entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		N2 = entrada.nextInt();

		soma = (N1 + N2);

		System.out.println(N1);
		System.out.println(N2);
		System.out.println(soma);

		entrada.close();

	}

}
