import java.util.Scanner;

public class A1_EX_08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N1, N2;

		System.out.print("Valor do primeiro número: ");
		N1 = teclado.nextInt();

		System.out.print("Valor do segundo número: ");
		N2 = teclado.nextInt();

		double resultado = Math.pow(N1, N2);
		System.out.println("Resultado: " + resultado);
		
		teclado.close();

	}

}
