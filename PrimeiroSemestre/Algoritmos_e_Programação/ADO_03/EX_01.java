import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;

		System.out.print("Digite um n�mero inteiro: ");
		n = entrada.nextInt();

		switch (n % 3) {
		case 0:
			System.out.println(n + " � divis�vel por 3");
			break;
		case 1:
			System.out.println(n + " n�o � divis�vel por 3");
			break;

		}

		entrada.close();

	}

}
