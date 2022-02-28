import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float altura, peso, massa;

		System.out.print("Informe a altura: ");
		altura = entrada.nextFloat();
		System.out.print("Informe o peso: ");
		peso = entrada.nextFloat();

		massa = (peso / (altura * altura));

		if (massa < 26) {
			System.out.println("Massa Corpórea: " + massa);
			System.out.println("Grau de Obesidade: Normal ");
		} else if ((massa >= 26) && (massa < 30)) {
			System.out.println("Massa Corpórea: " + massa);
			System.out.println("Grau de Obesidade: Obeso");
		} else {
			System.out.println("Massa corpórea: " + massa);
			System.out.println("Grau de Obesidade: Obeso Mórbido");
		}

		entrada.close();

	}

}
