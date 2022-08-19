package batalhatanques;

public class BatalhaTanques {
    public static void main(String[] args) {
        TanqueTracker t1 = new TanqueTracker();
        t1.setCorCanhao(CoresRGB.BLUE);
        t1.setCorTanque(CoresRGB.GREEN);
        t1.setX(2.3F);
        t1.setY(2.3F);
        System.out.println(t1.toString());
    }

}
