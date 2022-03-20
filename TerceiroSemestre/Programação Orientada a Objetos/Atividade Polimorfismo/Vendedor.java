package pacote;

public class Vendedor extends Pessoa {
	private double bonus;

	public Vendedor(double bonus, String nome, double salario) {
		super(nome, salario);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calcularSalario() {
		return getSalario() + this.bonus;
	}

	@Override
	public String toString() {
		return String.format("Nome: " + getNome() + " | Salário: " + calcularSalario());
	}
	
}
