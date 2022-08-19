package Aula02;

public class UsaSingleton {
    public static void main(String[] args) {
        Singleton sin1 = Singleton.getIntancia();
        Singleton sin2 = Singleton.getIntancia();
        System.out.println(sin1);
        System.out.println(sin2);
    }
}
