package pacote;

import java.util.ArrayList;

import pacote.Vendedor;
import pacote.Pessoa;
import pacote.Gerente;

public class Empresa {

	private ArrayList<Pessoa> pessoas;

	public static void main(String[] args) {
		Empresa listaEmpregado = new Empresa();
		listaEmpregado.carregar();
		listaEmpregado.calcular();
	}

	public Empresa() {
		pessoas = new ArrayList();
	}

	public void carregar() {
		pessoas.add(new Gerente(2000, "Alan", 5000));
		pessoas.add(new Vendedor(1000, "Bruno", 3000));

		System.out.println("Temos " + pessoas.size() + " funcionários.");
		System.out.println();
	}

	public void calcular() {
		double salarioTotal = 0.d;

		for (Pessoa pessoa : pessoas) {
			double salario = pessoa.calcularSalario();
			salarioTotal += salario;

			System.out.println(pessoa);

		}

		System.out.println("\nCusto dos funcionários: " + salarioTotal);

	}

}
