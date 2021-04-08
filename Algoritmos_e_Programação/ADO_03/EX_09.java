import java.util.Scanner;
public class EX_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String CPF;
		int valor;
		
		System.out.print("Informe o CPF: ");
		CPF = sc.next();
		
		valor = CPF.charAt(1);
		
		
		System.out.println(valor);
		
		sc.close();

	}

}
