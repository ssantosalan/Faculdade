package cestaComposite;

public class Leaf implements Component {
	private String nome;
	private double preco;
	
	private static int precoTotal = 0;

	public Leaf() {
		// TODO Auto-generated constructor stub
	}

	public Leaf(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.precoTotal += preco;
	}

	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Leaf [nome=" + nome + ", preco=" + preco + "]";
	}
	
	

}
