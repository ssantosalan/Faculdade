import java.util.Scanner;

public class EX_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String CPF;
		char valor;
		int n, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		double resultado, resto, resultado2, resto2;

		System.out.print("Informe o CPF (apenas números): ");
		CPF = sc.next();

		valor = CPF.charAt(0);
		n = Character.getNumericValue(valor);
		valor = CPF.charAt(1);
		n1 = Character.getNumericValue(valor);
		valor = CPF.charAt(2);
		n2 = Character.getNumericValue(valor);
		valor = CPF.charAt(3);
		n3 = Character.getNumericValue(valor);
		valor = CPF.charAt(4);
		n4 = Character.getNumericValue(valor);
		valor = CPF.charAt(5);
		n5 = Character.getNumericValue(valor);
		valor = CPF.charAt(6);
		n6 = Character.getNumericValue(valor);
		valor = CPF.charAt(7);
		n7 = Character.getNumericValue(valor);
		valor = CPF.charAt(8);
		n8 = Character.getNumericValue(valor);
		valor = CPF.charAt(9);
		n9 = Character.getNumericValue(valor);
		valor = CPF.charAt(10);
		n10 = Character.getNumericValue(valor);

		resultado = ((n * 10) + (n1 * 9) + (n2 * 8) + (n3 * 7) + (n4 * 6) + (n5 * 5) + (n6 * 4) + (n7 * 3) + (n8 * 2));

		resto = (resultado % 11);

		resultado = (11 - resto);

		if (resultado < 10) {

			if (resultado == n9) {
				resultado2 = ((n * 11) + (n1 * 10) + (n2 * 9) + (n3 * 8) + (n4 * 7) + (n5 * 6) + (n6 * 5) + (n7 * 4)
						+ (n8 * 3) + (n9 * 2));
				resto2 = (resultado2 % 11);
				resultado2 = (11 - resto2);

				if (resultado2 < 10) {
					if (resultado2 == n10) {
						System.out.println("CPF Válido!");

					} else {
						System.out.println("CPF Inválido!");
					}

				} else if (resultado2 == 0) {
					System.out.println("CPF Válido!");

				} else {
					System.out.println("CPF Inválido!");
				}
			} else {
				System.out.println("CPF Inválido!");
			}

		} else if (resultado == 0) {
			System.out.println("CPF Válido!");
		} else {
			System.out.println("CPF Inválido!");
		}

		sc.close();

	}

}
