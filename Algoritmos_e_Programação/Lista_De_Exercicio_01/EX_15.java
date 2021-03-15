import java.util.Scanner;

public class EX_15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double A, B, C, X1, X2, delta;
		
		System.out.print("Informe o valor de A: ");
		A = entrada.nextDouble();
		
		System.out.print("Informe o valor de B: ");
		B = entrada.nextDouble();
		
		System.out.print("Informe o valor de C: ");
		C = entrada.nextDouble();
		
		delta = (B*B) - 4 * A * C;
		
		if (delta >= 0 && A != 0) {
			
			X1 = (-B + Math.sqrt((B*B) - 4 * A * C)) / 2 * A;
			
			
		}
		
		
		System.out.println(X);
	}

}
