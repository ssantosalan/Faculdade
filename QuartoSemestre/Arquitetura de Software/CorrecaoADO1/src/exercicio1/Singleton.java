package exercicio1;

public class Singleton {
	// criar um atributo do tipo da classe
	private static Singleton singleton;

	private Singleton() {
	} 

	public synchronized static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
