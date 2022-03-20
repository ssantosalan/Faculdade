package pacote;

public class Gerente extends Pessoa {
	private double bonus;

	public Gerente(double bonus, String nome, double salario) {
		super(nome, salario);
		this.bonus = bonus;
	}

	public Gerente() {
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
