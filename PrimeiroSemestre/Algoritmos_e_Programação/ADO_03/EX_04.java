import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um m�s no ano de 2021. Ex: Janeiro - 1. Fevereiro - 2. Mar�o - 3...");
		System.out.print("N�mero do m�s: ");
		int mes = sc.nextInt();

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("Esse m�s tem 31 dias.");
			break;
		case 2:
			System.out.println("Esse m�s tem 28 dias.");
			break;
		case 4, 6, 9, 11:
			System.out.println("Esse m�s tem 30 dias.");
			break;
		default:
			System.out.println("M�s inv�lido!");

		}

		sc.close();

	}

}
