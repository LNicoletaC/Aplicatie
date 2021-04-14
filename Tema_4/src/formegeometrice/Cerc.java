package formegeometrice;

public class Cerc implements ShapeB {

	private double raza;
	private double ox;
	private double oy;

	public Cerc(double raza, double ox, double oy) {

		this.raza = raza;
		this.ox = ox;
		this.oy = oy;
	}

	public double getRaza() {
		return raza;
	}

	public double getOx() {
		return ox;
	}

	public double getOy() {
		return oy;
	}

	@Override
	public void showDetails() {
		System.out.println("Cerc:        raza=" + raza + ",  ox=" + ox + ",  oy=" + oy);
	}

}
