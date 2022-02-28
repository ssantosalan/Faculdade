import java.util.Scanner;

public class EX_02 {

	static int somatoria(int n) {
		int soma = 0;

		do {
			soma = soma + n;
			n--;
		} while (n > 0);

		return soma;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número inteiro positivo N: ");
		int n = entrada.nextInt();
		int somatoria = somatoria(n);
		System.out.println("Soma de todos os números inteiros positivos menores ou igual a N: " + somatoria);

		entrada.close();

	}

}
