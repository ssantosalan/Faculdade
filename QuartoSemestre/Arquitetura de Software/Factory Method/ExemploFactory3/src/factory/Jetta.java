package factory;

//ConcreteProduct
public class Jetta implements Carro {
	private double preco;
	private String modelo;

	public Jetta() {
	}

	public Jetta(double preco, String modelo) {
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
		return "Jetta [preco=" + preco + ", modelo=" + modelo + "]";
	}

}
