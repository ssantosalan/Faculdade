import java.util.Scanner;

public class ADO3_Ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double valorProduto, valorDescontado, desconto;

		System.out.print("Digite o valor da compra: R$ ");
		valorProduto = teclado.nextDouble();

		if (valorProduto >= 300) {
			desconto = (valorProduto * 0.20);
			valorDescontado = (valorProduto - desconto);
			System.out.printf("O valor da compra descontado é de: R$ %.2f \n", valorDescontado);
			System.out.printf("O valor do desconto é de: R$ %.2f \n", desconto);

		} else {
			desconto = (valorProduto * 0.15);
			valorDescontado = (valorProduto - desconto);
			System.out.printf("O valor da compra descontado é de: R$ %.2f \n", valorDescontado);
			System.out.printf("O valor do desconto é de: R$ %.2f \n", desconto);
		}

	}

}
