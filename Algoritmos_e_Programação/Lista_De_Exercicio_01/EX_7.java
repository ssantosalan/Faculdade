import java.util.Scanner;

public class EX_7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double A, B, hipotenusa;

		System.out.print("Digite o primeiro lado: ");
		A = entrada.nextFloat();

		System.out.print("Digite o segundo lado: ");
		B = entrada.nextFloat();

		hipotenusa =  Math.sqrt((A * A) + (B * B));

		System.out.print("A hipotenusa do triângulo é: " + hipotenusa);

		entrada.close();

	}

}
