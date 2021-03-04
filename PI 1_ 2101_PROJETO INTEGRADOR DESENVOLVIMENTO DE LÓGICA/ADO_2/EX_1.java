
package primeiro;

import java.util.Scanner;

/**
 * @author Alan
 */
public class EX_1 {

	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o primeiro valor: ");	
	float  n1 = entrada.nextFloat();
	
	System.out.print("Digite o segundo valor: ");
	float n2 = entrada.nextFloat();
	
	System.out.print("Digite o terceiro valor: ");
	float n3 = entrada.nextFloat();
	
	float produto = n1 * n2 * n3;
	System.out.println("O produto é: "+produto);
	}

}
