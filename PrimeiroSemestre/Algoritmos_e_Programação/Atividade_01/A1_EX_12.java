import java.util.Scanner;

public class A1_EX_12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nomeVendedor, codigoPeca;
		double comissao, precoPeca;
		int quantVendida;

		System.out.print("Informe o nome do vendedor: ");
		nomeVendedor = teclado.next();

		System.out.print("Informe o c�digo da pe�a: ");
		codigoPeca = teclado.next();

		System.out.print("Informe o pre�o unit�rio da pe�a: ");
		precoPeca = teclado.nextFloat();

		System.out.print("Informe a quantidade de pe�as vendidas: ");
		quantVendida = teclado.nextInt();

		comissao = ((precoPeca * quantVendida) * 0.05);

		System.out.println();
		System.out.println("Vendedor: " + nomeVendedor);
		System.out.println("C�digo da pe�a: " + codigoPeca);
		System.out.printf("A comiss�o recebida ser� de: R$ %.2f \n", comissao);

		teclado.close();

	}

}
