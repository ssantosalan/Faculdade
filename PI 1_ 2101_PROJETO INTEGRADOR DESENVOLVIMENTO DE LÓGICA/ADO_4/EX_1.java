import java.util.Scanner;

public class EX_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String operacaoStr;

		System.out.println("1. Domingo");
		System.out.println("2. Segunda-feira");
		System.out.println("3. Terça-feira");
		System.out.println("4. Quarta-feira");
		System.out.println("5. Quinta-feira");
		System.out.println("6. Sexta-feira");
		System.out.println("7. Sábado");

		System.out.print("Escrevar um valor de 1 a 7: ");

		operacaoStr = entrada.next();

		switch (operacaoStr) {
		case "1":
			System.out.println("1 corresponde a Domingo");
			break;
		case "2":
			System.out.println("2 corresponde a Segunda-feira!");
			break;
		case "3":
			System.out.println("3 corresponde a Terça-feira!");
			break;
		case "4":
			System.out.println("4 corresponde a Quarta-feira!");
			break;
		case "5":
			System.out.println("5 corresponde a Quinta-feira!");
			break;
		case "6":
			System.out.println("6 corresponde a Sexta-feira!");
			break;
		case "7":
			System.out.println("7 corresponde a Sábado!");
			break;
		default:
			System.out.println("Valor inválido!");

		}

		entrada.close();
	}
}
