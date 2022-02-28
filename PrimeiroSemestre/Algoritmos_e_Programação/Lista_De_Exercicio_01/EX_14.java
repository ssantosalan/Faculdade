import java.util.Scanner;

public class EX_14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float N1, N2, divisao;

		System.out.print("Informe o primeiro número: ");
		N1 = entrada.nextFloat();

		System.out.print("Informe o segundo número: ");
		N2 = entrada.nextFloat();

		if (N1 > N2) {
			divisao = (N1 / N2);
			System.out.println("A divisão do maior pelo menor é igual a: " + divisao);
		} else {
			divisao = (N2 / N1);
			System.out.println("A divisão do maior pelo menor é igual a: " + divisao);
		}

		entrada.close();
	}

}
