package factory;

//ConcreteProduct
public class Fox implements Carro {
	private double preco;
	private String modelo;

	public Fox() {
	}

	public Fox(double preco, String modelo) {
		super();
		this.preco = preco;
		this.modelo = modelo;
	}

	@Override
	public double getPreco() {
		return this.preco;
	}

	@Override
	public String getModelo() {
		return this.modelo;
	}

	@Override
	public String toString() {
		return "Fox [preco=" + preco + ", modelo=" + modelo + "]";
	}
	
	
	
}
