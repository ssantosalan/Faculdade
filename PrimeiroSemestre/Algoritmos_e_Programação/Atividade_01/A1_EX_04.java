import java.util.Scanner;

public class A1_EX_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigoPeca, valorPeca, quantPeca, valorTotal;

		System.out.print("Digite o c�digo da pe�a: ");
		codigoPeca = entrada.nextInt();

		System.out.print("Digite o valor da pe�a: ");
		valorPeca = entrada.nextInt();

		System.out.print("Digite a quantidade da pe�a: ");
		quantPeca = entrada.nextInt();

		valorTotal = (valorPeca * quantPeca);

		System.out.println("C�digo da pe�a: " + codigoPeca);
		System.out.println("Valor final: " + valorTotal);

		entrada.close();

	}

}
