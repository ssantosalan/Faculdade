/*
Grupo: 
	Alan Silva dos Santos
	Guilherme Alves Martins
	Jorge Luiz dos Santos Oliveira
	
A multiplica��o Russa consiste em:
a) Escrever os n�meros A e B, que se deseja multiplicar na parte superior das colunas;
b) Dividir A por 2, sucessivamente, ignorando o resto at� chegar � unidade, escrever os resultados da coluna A;
c) Multiplicar B por 2 tantas vezes quantas se haja dividido A por 2, escrever os resultados sucessivos na coluna
B;
d) Somar todos os n�meros da coluna B que estejam ao lado de um n�mero �mpar da coluna A.
Exemplo: 27 x 82 = 2214

Soma: 2214
Criar uma fun��o recursiva que permita fazer � multiplica��o russa de 2 entradas.
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
