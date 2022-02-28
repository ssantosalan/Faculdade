import java.util.Scanner;

public class A1_EX_12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nomeVendedor, codigoPeca;
		double comissao, precoPeca;
		int quantVendida;

		System.out.print("Informe o nome do vendedor: ");
		nomeVendedor = teclado.next();

		System.out.print("Informe o código da peça: ");
		codigoPeca = teclado.next();

		System.out.print("Informe o preço unitário da peça: ");
		precoPeca = teclado.nextFloat();

		System.out.print("Informe a quantidade de peças vendidas: ");
		quantVendida = teclado.nextInt();

		comissao = ((precoPeca * quantVendida) * 0.05);

		System.out.println();
		System.out.println("Vendedor: " + nomeVendedor);
		System.out.println("Código da peça: " + codigoPeca);
		System.out.printf("A comissão recebida será de: R$ %.2f \n", comissao);

		teclado.close();

	}

}
