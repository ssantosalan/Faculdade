package composite;
import java.util.ArrayList;
import java.util.List;


public class Diretoria implements DepartamentoComponent{
	
	private List<DepartamentoComponent> lista = new ArrayList<>();
	private String nome;
	
	public Diretoria() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void adicionar(Departamento d) {
		this.lista.add(d);
	}

	public void remover(Departamento d) {
		this.lista.remove(d);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public Double getCusto() {
		Double total=0.;
		for (DepartamentoComponent departamentoComponent : lista) {
			total+=departamentoComponent.getCusto();
		}
		return total;

	}


	@Override
	public Integer getFuncionarios() {
		Integer total=0;
		for (DepartamentoComponent departamentoComponent : lista) {
			total+=departamentoComponent.getFuncionarios();
		}
		return total;

		
	}

}
