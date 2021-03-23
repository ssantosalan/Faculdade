import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double conta, kw;
		
		System.out.print("Informe o KW Consumido: ");
		kw = entrada.nextDouble();
		
		if (kw < 150) {
			conta = (kw * 0.20);
			System.out.println("Conta: R$" + conta);
		} else if ((kw >= 150) && (kw < 500)) {
			conta = (kw * 0.25);
			System.out.println("Conta: R$" + conta);
		} else {
			conta = (kw * 0.30);
			System.out.println("Conta: R$" + conta);
		}
		
		
		
		
		
		entrada.close();

	}

}
