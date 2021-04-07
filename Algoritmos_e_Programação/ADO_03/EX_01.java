import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;

		System.out.print("Digite um número inteiro: ");
		n = entrada.nextInt();

		switch (n % 3) {
		case 0:
			System.out.println(n + " é divisível por 3");
			break;
		case 1:
			System.out.println(n + " não é divisível por 3");
			break;

		}

		entrada.close();

	}

}
