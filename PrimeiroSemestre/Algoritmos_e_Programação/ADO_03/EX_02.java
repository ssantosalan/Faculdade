import java.util.Scanner;

public class EX_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

		System.out.println("Digite 1 - Domingo");
		System.out.println("Digite 2 - Segunda-feira");
		System.out.println("Digite 3 - Ter�a-feira");
		System.out.println("Digite 4 - Quarta-feira");
		System.out.println("Digite 5 - Quinta-fera");
		System.out.println("Digite 6 - Sexta-feira");
		System.out.println("Digite 7 - S�bado");
		System.out.println();
		System.out.print("Informe o dia: ");
		opcao = sc.nextInt();

		switch (opcao) {
		case 2, 3, 4, 5, 6:
			System.out.println("� dia �til!");
			break;
		case 1, 7:
			System.out.println("� fim de semana!");
			break;
		default:
			System.out.println("Dia inv�lido!");
			break;

		}

		sc.close();

	}

}
