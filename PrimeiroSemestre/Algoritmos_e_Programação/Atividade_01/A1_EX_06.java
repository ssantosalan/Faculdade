import java.util.Scanner;

public class A1_EX_06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N;

		System.out.print("Digite um n�mero: ");
		N = entrada.nextInt();

		N = (N * N);

		System.out.println("O quadrado desse n�mero �: " + N);

		entrada.close();

	}

}
