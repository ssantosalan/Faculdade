import java.util.Scanner;

public class EX_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a;

		System.out.println("1. Domingo");
		System.out.println("2. Segunda-feira");
		System.out.println("3. Ter�a-feira");
		System.out.println("4. Quarta-feira");
		System.out.println("5. Quinta-feira");
		System.out.println("6. Sexta-feira");
		System.out.println("7. S�bado");

		System.out.print("Escrevar um valor de 1 a 7: ");

		a = entrada.nextInt();

		switch (a) {
		case 1:
			System.out.println("1 corresponde a Domingo");
			break;
		case 2:
			System.out.println("2 corresponde a Segunda-feira!");
			break;
		case 3:
			System.out.println("3 corresponde a Ter�a-feira!");
			break;
		case 4:
			System.out.println("4 corresponde a Quarta-feira!");
			break;
		case 5:
			System.out.println("5 corresponde a Quinta-feira!");
			break;
		case 6:
			System.out.println("6 corresponde a Sexta-feira!");
			break;
		case 7:
			System.out.println("7 corresponde a S�bado!");
			break;
		default:
			System.out.println("Valor inv�lido!");

		}

		entrada.close();
	}
}
