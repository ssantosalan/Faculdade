package pacote;

public class Pessoa {
	private String nome;
	private double salario;

	public Pessoa(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularSalario() {
		System.out.println("Não devo rodar!");
		return 0;
	}

}
