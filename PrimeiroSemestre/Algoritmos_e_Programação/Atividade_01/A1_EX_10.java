import java.util.Scanner;
public class A1_EX_10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float cotDolar, quantDolar, valorReal;
		
		System.out.print("Digite a cota��o do d�lar: ");
		cotDolar = teclado.nextFloat();
		
		System.out.print("Digite a quantidade de d�lares: ");
		quantDolar = teclado.nextFloat();
		
		valorReal = (quantDolar*cotDolar);
		System.out.println("A convers�o do valor de d�lares para real � igual a: " + valorReal);
		
		teclado.close();
	}

}
