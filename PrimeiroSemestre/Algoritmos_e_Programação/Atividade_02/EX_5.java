import java.util.Scanner;

public class EX_5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Celsius, F;

		System.out.print("Digite a temperatura em Fahrenheit: ");
		F = entrada.nextInt();

		Celsius = (F - 32) * 5 / 9;

		System.out.println("A convers�o de Fahrenheit para graus Celsius �: " + Celsius + "�C");

		entrada.close();

	}

}
