import java.util.Scanner;

public class EX_2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1;

		System.out.print("Digite um n�mero inteiro positivo: ");
		N1 = entrada.nextInt();

		if (N1 > 0) {

			N1 = (N1 * 2);
			System.out.print("O dobro do valor informado � igual a: " + N1);

		} else {
			System.out.println("O valor informado n�o � um n�mero inteiro positivo.");
		}

		entrada.close();
	}

}
