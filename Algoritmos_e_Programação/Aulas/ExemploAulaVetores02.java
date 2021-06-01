import java.util.Scanner;

public class ExemploAulaVetores02 {

	static Scanner input = new Scanner(System.in);

	static int tamanhoVetor() {
		System.out.println("*- Tamanho do vetor -*");
		int tamanho;
		System.out.println("Tamanho do vetor: ");
		tamanho = input.nextInt();

		return tamanho;
	}

	static int[] criarVetor(int tamanho) {
		System.out.println("*- Criação do Vetor -*");
		int[] vetor = new int[tamanho]; // criando um vetor com elementos ZEROS

		return vetor;
	}

	static int[] populaVetor(int[] vetor) {
		System.out.println("*- População do Vetor -*");

		for (int i = 0; i < vetor.length; i++) { // length é um comando que devolve o tamanho da estrutura
			System.out.printf("vetor[%d] = ", i);
			System.out.println("");
			vetor[i] = input.nextInt();
		}

		return vetor;
	}

	
	static int[] operacaoMairMenorSoma(int[] vetorPreenchido) {
		System.out.println("*- Operação do maior, menor e soma dos elementos do vetor -*");
		int[] vetorResultado = new int[3];
		int soma = 0;
		int menor = vetorPreenchido[0];
		int maior = vetorPreenchido[0];
		
		for(int i = 0; i < vetorPreenchido.length; i++) {
			soma = soma + vetorPreenchido[i];
			
			if(vetorPreenchido[i] < menor) {
				menor = vetorPreenchido[i];
			}
			if(vetorPreenchido[i] > maior)
				maior = vetorPreenchido[i];
			
		}
		
		vetorResultado[0] = maior;
		vetorResultado[1] = menor;
		vetorResultado[2] = soma;
		
		return vetorResultado;
	}
	
	static void imprimirDados(int[] vetor) {
		System.out.println("*- Imprimir dados -*");
		System.out.printf("Maior: %d \nMenor: %d \nSoma: %d \n", vetor[0], vetor[1], vetor[2]);
		
	}
  	
	
	public static void main(String[] args) {

		int t = tamanhoVetor();
		int[] v = criarVetor(t);
		v = populaVetor(v);
		int[] vetorR = operacaoMairMenorSoma(v);
		imprimirDados(vetorR);
	}

}
