package batalhatanques;

public class TanqueTracker implements Posicao, Cor, Canhao {
    private CoresRGB corTanque, corCanhao;
    private float x, y;

    @Override
    public void atirar() {
        System.out.println("PLAQTUDUM POW POW");
    }

    @Override
    public void setCorTanque(CoresRGB corTanque) {
        this.corTanque = corTanque;
    }

    @Override
    public void setCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public CoresRGB getCorTanque() {
        return null;
    }

    @Override
    public CoresRGB getCorCanhao() {
        return null;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public float getX() {
        return this.x;
    }

    @Override
    public float getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "TanqueTracker{" +
                "corTanque=" + corTanque +
                ", corCanhao=" + corCanhao +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
