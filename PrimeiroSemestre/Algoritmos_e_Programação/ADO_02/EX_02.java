import java.util.Scanner;

public class EX_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2;

		System.out.print("Digite o primeiro n�mero: ");
		n1 = entrada.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		n2 = entrada.nextInt();

		if (n1 % n2 == 0) {
			System.out.println("A divis�o de " + n1 + " por " + n2 + " � exata.");
		}

		entrada.close();

	}

}
