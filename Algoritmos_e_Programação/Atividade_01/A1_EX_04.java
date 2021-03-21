import java.util.Scanner;

public class A1_EX_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigoPeca, valorPeca, quantPeca, valorTotal;

		System.out.print("Digite o código da peça: ");
		codigoPeca = entrada.nextInt();

		System.out.print("Digite o valor da peça: ");
		valorPeca = entrada.nextInt();

		System.out.print("Digite a quantidade da peça: ");
		quantPeca = entrada.nextInt();

		valorTotal = (valorPeca * quantPeca);

		System.out.println("Código da peça: " + codigoPeca);
		System.out.println("Valor final: " + valorTotal);

		entrada.close();

	}

}
