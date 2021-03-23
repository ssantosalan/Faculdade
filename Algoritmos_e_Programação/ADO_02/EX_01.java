import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, soma;

		System.out.print("Digite um número: ");
		n = entrada.nextInt();

		if (n > 100) {
			soma = n + 150;
			System.out.println("Resultado: " + soma);
		} else {
			System.out.println("O número NÃO é maior que 100");
		}

		entrada.close();

	}

}
