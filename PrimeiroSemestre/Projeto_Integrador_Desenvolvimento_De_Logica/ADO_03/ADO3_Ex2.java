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
			
			System.out.println("Forma um tri�ngulo!");
			if  ((A == B) && (B == C)) {
				System.out.println("E � um tri�ngulo Equil�tero!");
			} else if ((A == B) || (B == C)) {
				System.out.println("E � um tri�ngulo Is�sceles!");
			} else {
				System.out.println("E � um tri�ngulo Escaleno!");
			}
		
		} else {
			System.out.println("N�o forma um tri�ngulo!");
		}

		
	}

}
