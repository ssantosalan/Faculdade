/*
Grupo: 
	Alan Silva dos Santos
	Guilherme Alves Martins
	Jorge Luiz dos Santos Oliveira
	
A multiplicação Russa consiste em:
a) Escrever os números A e B, que se deseja multiplicar na parte superior das colunas;
b) Dividir A por 2, sucessivamente, ignorando o resto até chegar à unidade, escrever os resultados da coluna A;
c) Multiplicar B por 2 tantas vezes quantas se haja dividido A por 2, escrever os resultados sucessivos na coluna
B;
d) Somar todos os números da coluna B que estejam ao lado de um número ímpar da coluna A.
Exemplo: 27 x 82 = 2214

Soma: 2214
Criar uma função recursiva que permita fazer à multiplicação russa de 2 entradas.
 */
public class EX_06 {

	public static void main(String[] args) {
		int resultado = multRussa(20, 0);

		System.out.println(resultado);
	}

	public static int multRussa(int a, int b) {
		if (a == 0) {
			return 0;
		} else if ((a % 2) == 1) {
			a -= 1;
			return multRussa(a / 2, b * 2) + b;
		} else {
			return multRussa(a / 2, b * 2);
		}

	}

}
