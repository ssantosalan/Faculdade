import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, soma = 0, x, positivos = 0;
		double media = 0;

		while (i < 7) {
			System.out.println("Digite o valor " + i);
			x = sc.nextInt();

			if (x > 0) {
				positivos++;
				soma = soma + x;

			}
			i++;

		}
		media = ((double) soma / positivos);

		System.out.println("Soma de todos os valores positivos: " + soma);
		System.out.println("Quantidade de números positivos: " + positivos);
		System.out.println("Média dos números positivos: " + media);

		sc.close();
	}

}
