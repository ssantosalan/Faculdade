import java.util.Scanner;

public class EX_06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double A, B, C, area, perimetro;

		System.out.print("Digite o primeiro n�mero: ");
		A = entrada.nextFloat();

		System.out.print("Digite o segundo n�mero: ");
		B = entrada.nextFloat();

		System.out.print("Digite o terceiro n�mero: ");
		C = entrada.nextFloat();

		area = (A * C) / 2;

		System.out.println("A �rea do tri�ngulo ret�ngulo �: " + area);

		area = Math.PI * (C * C);

		System.out.println("A �rea do c�rculo � igual a: " + area);

		area = ((A + B) * C) / 2;

		System.out.println("A �rea do trap�zio � igual a: " + area);

		area = (B * B);

		System.out.println("A �rea do quadrado � igual a: " + area);

		area = (A * B);

		System.out.println("A �rea do ret�ngulo � igual a: " + area);

		perimetro = (A + A + B + B);

		System.out.println("O per�metro do ret�ngulo � igual a: " + perimetro);

		entrada.close();

	}

}
