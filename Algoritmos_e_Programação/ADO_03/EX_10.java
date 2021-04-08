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

		System.out.println("Informe a operação. Ex: '+', '-', '*' ou '/'");
		System.out.print("Operação: ");
		operacao = sc.next().charAt(0);

		switch (operacao) {
		case '+':
			System.out.println("Soma: " + (n1 + n2));
			break;
		case '-':
			System.out.println("Diferença: " + (n1 - n2));
			break;
		case '*':
			System.out.println("Multiplicação: " + (n1 * n2));
			break;
		case '/':
			System.out.println("Divisão: " + (n1 / n2));
			break;
		default:
			System.out.println("Operação Inválida!");

		}

		sc.close();
	}

}
