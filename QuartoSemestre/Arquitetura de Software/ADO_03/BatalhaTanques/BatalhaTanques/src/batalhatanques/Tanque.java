
package batalhatanques;

public class Tanque implements Cores, Posicao, Canhao {
	private double x, y;
	private CoresRGB corTanque;
	private CoresRGB corCanhao;

	@Override
	public void setCorTanque(CoresRGB corTanque) {
		this.corTanque = corTanque;
	}

	@Override
	public CoresRGB getCorTanque() {
		return this.corTanque;
	}

	@Override
	public CoresRGB getCorCanhao() {
		return this.corCanhao;
	}

	@Override
	public void setCorCanhao(CoresRGB corCanhao) {
		this.corCanhao = corCanhao;
	}

	@Override
	public void setX(double x) {
		this.x = x;
	}

	@Override
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public double getX() {
		return this.x;
	}

	@Override
	public double getY() {
		return this.y;
	}

	@Override
	public void atirar() {
		System.out.println("Atirando...");
	}

	@Override
	public String toString() {
		return "Tanque{" + "x=" + x + ", y=" + y + ", corTanque=" + corTanque + ", corCanhao=" + corCanhao + '}';
	}

}
