import java.util.Scanner;

public class EX_04 {

	static int fatorial(int n) {
		int fatorial = 1;

		do {
			fatorial = fatorial * n;
			n--;
		} while (n > 0);

		return fatorial;
	}

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
		System.out.println("\nSoma de todos os números inteiros positivos menores ou igual a " + n + ": " + somatoria);

		System.out.print("\nInforme N: ");
		n = entrada.nextInt();
		int fatorial = fatorial(n);
		System.out.println("\nFatorial: " + fatorial);

		int divisao = fatorial / somatoria;

		System.out.println("\nDivisão: " + divisao);

		entrada.close();

	}

}
