import java.util.Scanner;

public class EX_6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float area, base, altura;

		System.out.print("Digite o valor da base do tri�ngulo: ");
		base = entrada.nextFloat();

		System.out.print("Digite o valor da altura do tri�ngulo: ");
		altura = entrada.nextFloat();

		area = (base * altura) / 2;

		System.out.print("A �rea do tri�ngulo � igual a: " + area);

		entrada.close();

	}

}
