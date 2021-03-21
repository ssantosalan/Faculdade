import java.util.Scanner;
import java.lang.Math;

public class EX_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float raio, circumference;

		System.out.print("Digite o valor do raio: ");

		raio = entrada.nextFloat();

		circumference = (float) (2 * Math.PI * raio);

		System.out.print("O comprimento da circuferência é igual a: " + circumference);

		entrada.close();

	}

}
