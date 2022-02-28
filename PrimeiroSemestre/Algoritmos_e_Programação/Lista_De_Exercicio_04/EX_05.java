
public class EX_05 {

	public static void main(String[] args) {
		int vetor[] = { 1, 2, 3, 4, 5 };
		int soma = 0;
		int contador = 0;
		for (int item : vetor) {
			contador++;
			soma = soma + item;
			
		}
		
		double media = soma / contador;
		System.out.println("Soma: " + soma);
		System.out.println("Quantidade de números: " + contador);
		System.out.println("Média: " + media);
	}

}
