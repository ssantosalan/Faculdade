package empresaComposite;

public class Desconto implements DepartamentoComponent {
	private String nome_arquivo;
	private float tamanho;

	public Desconto() {

	}

	public Desconto(String nome_arquivo, float tamanho) {
		super();
		this.nome_arquivo = nome_arquivo;
		this.tamanho = tamanho;
	}

	@Override
	public double getCusto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFuncionarios() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDesconto(double preco, double desconto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Desconto [nome_arquivo=" + nome_arquivo + ", tamanho=" + tamanho + "]";
	}
	
	

}
