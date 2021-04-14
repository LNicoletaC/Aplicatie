package formegeometrice;

public class Patrat implements ShapeB {

	private double latura;

	public Patrat(double latura) {
		this.latura = latura;
	}

	public double getLatura() {
		return latura;
	}

	@Override
	public void showDetails() {
		System.out.println("Patrat:      latura=" + latura);
	}

}
