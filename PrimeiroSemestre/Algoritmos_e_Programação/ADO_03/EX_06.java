import java.util.Scanner;

public class EX_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte opcao;

		System.out.println("Segunda-feira -> 1");
		System.out.println("Ter�a-feira   -> 2");
		System.out.println("Quarta-feira  -> 3");
		System.out.println("Quinta-feira  -> 4");
		System.out.println("Sexta-feira   -> 5");
		System.out.println("S�bado        -> 6");
		System.out.println("Domingo       -> 7");
		System.out.println();
		System.out.print("Informe o dia: ");

		opcao = sc.nextByte();

		switch (opcao) {
		case 1, 2, 3, 4, 5:
			System.out.println("� dia de semana!");
			break;
		case 6, 7:
			System.out.println("� fim de semana!");
			break;
		default:
			System.out.println("Dia inv�lido!");
			break;

		}

		sc.close();

	}

}
