import java.util.Scanner;

public class EX_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um valor maior ou igual a 2 e menor ou igual a 1000: ");
		int N = sc.nextInt();
		int i = 0;
		if (N >= 2 && N <= 1000) {
			do {
				i++;
				System.out.println(i + " x " + N + " = " + (i * N));

			} while (i < 10);

		} else {
			System.out.println("Valor inválido!");
		}

		sc.close();

	}

}
