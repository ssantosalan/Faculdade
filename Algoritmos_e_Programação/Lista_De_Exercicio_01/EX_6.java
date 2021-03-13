import java.util.Scanner;
import java.math.*;

public class EX_6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double A, B, C, area, perimetro;

		System.out.print("Digite o primeiro número: ");
		A = entrada.nextFloat();

		System.out.print("Digite o segundo número: ");
		B = entrada.nextFloat();

		System.out.print("Digite o terceiro número: ");
		C = entrada.nextFloat();

		area = (A * C) / 2;

		System.out.println("A área do triângulo retângulo é: " + area);

		area = Math.PI * (C * C);

		System.out.println("A área do círculo é igual a: " + area);

		area = ((A + B) * C) / 2;

		System.out.println("A área do trapézio é igual a: " + area);

		area = (B * B);

		System.out.println("A área do quadrado é igual a: " + area);

		area = (A * B);

		System.out.println("A área do retângulo é igual a: " + area);

		perimetro = (A + A + B + B);

		System.out.println("O perímetro do retângulo é igual a: " + perimetro);

		entrada.close();

	}

}
