package factory;

public class FabricaVW {

	public static Carro factoryMethod(Lista lista) {
		Carro c = null;
		if (lista.equals(Lista.FOX)) {
			c = new Fox(60000, "Cross fox");
		} else if (lista.equals(Lista.JETTA)) {
			c = new Jetta(120000, "Jetta TSI");
		}
		return c;
	}
}
