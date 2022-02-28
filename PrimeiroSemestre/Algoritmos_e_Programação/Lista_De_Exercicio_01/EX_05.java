import java.util.Scanner;

public class EX_05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int L, area;

		System.out.print("Digite o valor do lado do quadrado: ");
		L = entrada.nextInt();

		area = (L * L);

		System.out.print("A área desse quadrado é igual a: " + area);

		entrada.close();

	}

}
