
package batalhatanques;

public class BatalhaTanques {
 
    public static void main(String[] args) {
        Tanque t1=new Tanque();
        t1.setCorCanhao(CoresRGB.RED);
        t1.setCorTanque(CoresRGB.GREEN);
        t1.setX(1.3);
        t1.setY(2.6);
        System.out.println(t1);
    }
    
}
