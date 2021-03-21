import java.util.Scanner;

public class EX_6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float area, base, altura;

		System.out.print("Digite o valor da base do triângulo: ");
		base = entrada.nextFloat();

		System.out.print("Digite o valor da altura do triângulo: ");
		altura = entrada.nextFloat();

		area = (base * altura) / 2;

		System.out.print("A área do triângulo é igual a: " + area);

		entrada.close();

	}

}
