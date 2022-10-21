package usaFactory;

import factory.Carro;
import factory.FabricaVW;
import factory.Lista;

public class FabricaCarro {

	public static void main(String[] args) {
		Carro c = FabricaVW.factoryMethod(Lista.values()[1]);
		System.out.println(c);

	}

}
