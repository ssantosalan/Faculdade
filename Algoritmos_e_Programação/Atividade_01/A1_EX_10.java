import java.util.Scanner;
public class A1_EX_10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float cotDolar, quantDolar, valorReal;
		
		System.out.print("Digite a cotação do dólar: ");
		cotDolar = teclado.nextFloat();
		
		System.out.print("Digite a quantidade de dólares: ");
		quantDolar = teclado.nextFloat();
		
		valorReal = (quantDolar*cotDolar);
		System.out.println("A conversão do valor de dólares para real é igual a: " + valorReal);
		
		teclado.close();
	}

}
