package terceiro;

import java.util.Scanner;

public class EX_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor de 1 a 10: ");
		
		int n = entrada.nextInt();
		
		System.out.println("A tabuada de "+n+" é: ");
		System.out.println(n + " x 1 = " + n*1);
		System.out.println(n + " x 2 = " + n*2);
		System.out.println(n + " x 3 = " + n*3);
		System.out.println(n + " x 4 = " + n*4);
		System.out.println(n + " x 5 = " + n*5);
		System.out.println(n + " x 6 = " + n*6);
		System.out.println(n + " x 7 = " + n*7);
		System.out.println(n + " x 8 = " + n*8);
		System.out.println(n + " x 9 = " + n*9);
		System.out.println(n + " x 10 = " + n*10);
	}

}
