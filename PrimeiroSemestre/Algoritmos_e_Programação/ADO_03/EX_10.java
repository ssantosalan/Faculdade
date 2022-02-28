import java.util.Scanner;

public class EX_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		char operacao;

		System.out.print("Informe o primeiro valor: ");
		n1 = sc.nextDouble();
		System.out.print("Informe o segundo valor: ");
		n2 = sc.nextDouble();

		System.out.println("Informe a opera��o. Ex: '+', '-', '*' ou '/'");
		System.out.print("Opera��o: ");
		operacao = sc.next().charAt(0);

		switch (operacao) {
		case '+':
			System.out.println("Soma: " + (n1 + n2));
			break;
		case '-':
			System.out.println("Diferen�a: " + (n1 - n2));
			break;
		case '*':
			System.out.println("Multiplica��o: " + (n1 * n2));
			break;
		case '/':
			System.out.println("Divis�o: " + (n1 / n2));
			break;
		default:
			System.out.println("Opera��o Inv�lida!");

		}

		sc.close();
	}

}
