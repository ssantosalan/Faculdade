import java.util.Scanner;

public class ADO3_Ex2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A, B, C;
		System.out.print("Digite o lado A: ");
		A = teclado.nextInt();
		System.out.print("Digite o lado B: ");
		B = teclado.nextInt();
		System.out.print("Digite o lado C: ");
		C = teclado.nextInt();
		
		if ((A < B + C) && (B < A + C) && (C < A + B)) {
			
			System.out.println("Forma um triângulo!");
			if  ((A == B) && (B == C)) {
				System.out.println("E é um triângulo Equilátero!");
			} else if ((A == B) || (B == C)) {
				System.out.println("E é um triângulo Isósceles!");
			} else {
				System.out.println("E é um triângulo Escaleno!");
			}
		
		} else {
			System.out.println("Não forma um triângulo!");
		}

		
		

	}

}
