package ADO01;

public class Livro {
	public int id;
	public String autor;
	public String titulo;

	// Construtores
		
	public Livro(int id, String autor, String titulo) {
		this.id += id;
		this.autor += autor;
		this.titulo += titulo;
	}

	public Livro() {
		
	}

	// Método toString
	@Override 
	public String toString () {
		return "ID: " + this.id + ", Autor: " + this.autor + ", Título: " + this.titulo;
	}

	// Métodos Setters and Getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
