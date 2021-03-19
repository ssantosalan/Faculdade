import java.util.Scanner;

public class EX_18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float N1, N2, N3, A, B, C;
		N1 = 1;
		N2 = 1;
		N3 = 1;
		
		System.out.print("Informe o primeiro lado: ");
		A = entrada.nextFloat();

		System.out.print("Informe o segundo lado: ");
		B = entrada.nextFloat();

		System.out.print("Informe o terceiro lado: ");
		C = entrada.nextFloat();

		if (A >= B && A >= C) {
			N1 = A;
			if (B >= C) {
			N2 = B;
			N3 = C;
			}
		} else {
			N2 = C;
			N3 = B;
		}
		if (B >= A && B >= C) {
			N1 =B;
			if (A >= C) {
				N2 = A;
				N3 = C;
			} else {
				N2 = C;
				N3 = A;
			}
		}
		if (C >= A && C >= B) {
			N1 = C;
			if (A >= B) {
				N2 = B;
				N3 = A;
			} else {
				N2 = B;
				N3 = A;
			}
		}
		if (A == B && B == C) {
			N1 = A;
			N2 = B;
			N3 = C;
		}
		A = N1;
		B = N2;
		C = N3;

		if (A >= (B + C)) {
			System.out.println("NÃO FORMA TRIÂNGULO");
		
		} else if ((A * A) == (B * B) + (C * C)) 
			System.out.println("TRIÂNGULO RETÂNGULO");
		
		if ((A * A > B * B + C * C) && (A != B + C))
			System.out.println("TRIÂNGULO OBTUSÂNGULO");
		
		if ((A * A) < ((B * B) + (C * C))) 
			System.out.println("TRIÂNGULO ACUTÂNGULO");
		
		if ((A == B && B == C)) 
			System.out.println("TRIÂNGULO EQUILÁTERO");
		
		if ((A == B && B != C) || (B == C && C != A) || (A == C && C != B)) 
			System.out.println("TRIÂNGULO ISÓSCELES");
		

		entrada.close();

	}

}
