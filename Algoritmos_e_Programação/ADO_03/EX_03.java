import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5 = 0;

		System.out.print("Informe o valor a ser retirado: ");
		valor = sc.nextInt();

		do {
			if (valor >= 100) {
				contador1 = contador1 + 1;
				valor = valor - 100;
			} else if (valor >= 50) {
				contador2 = contador2 + 1;
				valor = valor - 50;
			} else if (valor >= 10) {
				contador3 = contador3 + 1;
				valor = valor - 10;
			} else if (valor >= 5) {
				contador4 = contador4 + 1;
				valor = valor - 5;
			} else if (valor >= 1) {
				contador5 = contador5 + 1;
				valor = valor - 1;
			}

		} while (valor != 0);

		if (contador1 != 0) {
			System.out.println(contador1 + " nota(s) de R$100");
		}
		if (contador2 != 0) {
			System.out.println(contador2 + " notas(s) de R$50");
		}
		if (contador3 != 0) {
			System.out.println(contador3 + " notas(s) de R$10");
		}
		if (contador4 != 0) {
			System.out.println(contador4 + " notas(s) de R$5");
		}
		if (contador5 != 0) {
			System.out.println(contador5 + " notas(s) de R$1");
		}

		sc.close();
	}

}
