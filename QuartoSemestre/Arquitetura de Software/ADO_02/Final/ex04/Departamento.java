package ex04;

public class Departamento implements DepartamentoComponent {
	Integer funcionarios;
	Double custo;

	@Override
	public Double getCusto() {
		return this.custo;
		
	}

	@Override
	public Integer getFuncionarios() {
	 
		return this.funcionarios;
	}

	public Departamento(Integer funcionarios, Double custo) {
		this.funcionarios = funcionarios;
		this.custo = custo;
	}
	
	public Departamento() {
	}

}
