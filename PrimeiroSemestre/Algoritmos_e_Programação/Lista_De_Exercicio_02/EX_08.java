
public class EX_08 {

	public static void main(String[] args) {
		int contador = 0;
		int soma = 0;
		
		for (int i = 13; i < 73; i++) {
			if (i % 2 == 0) {
				contador++;
				soma = soma + i;
			}
		}
		int media = soma / contador;
		System.out.println("Média: " + media);

	}

}
