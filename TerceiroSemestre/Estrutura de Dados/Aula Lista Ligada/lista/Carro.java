package lista;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private int id;

	public Carro(String marca, String modelo, int ano, int id) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.id = id;
	}

	public Carro() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", id=" + id + "]";
	}

}
