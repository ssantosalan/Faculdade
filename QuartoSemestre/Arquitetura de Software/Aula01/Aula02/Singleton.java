package Aula02;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getIntancia() {
        return singleton;
    }

}
