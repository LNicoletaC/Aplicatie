package formegeometrice;

public class Dreptunghi implements ShapeB {

	private double width;
	private double height;

	public Dreptunghi(double width, double height) {

		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public void showDetails() {
		System.out.println("Dreptunghi:  width=" + width + ",  height=" + height);
	}

}