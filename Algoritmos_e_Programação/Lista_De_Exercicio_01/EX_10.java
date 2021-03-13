import java.util.Scanner;

public class EX_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		float salarioFixo, comissao, totalVendas;

		System.out.print("Digite o nome do vendedor: ");
		nome = entrada.next();

		System.out.print("Informe o salário fixo do vendedor: ");
		salarioFixo = entrada.nextFloat();

		System.out.print("Informe o total de vendas efetuadas pelo vendedor: ");
		totalVendas = entrada.nextFloat();

		comissao = (float) (totalVendas * 0.15);

		salarioFixo = salarioFixo + comissao;

		System.out.println();
		System.out.printf(nome + " tem o total a receber no final do mês de: %.2f \n", salarioFixo);

		entrada.close();

	}

}
