package formegeometrice;

public class Shape {

	public static void main(String[] args) {

		Cerc c1 = new Cerc(10, 11, 12);
		Composite c = new Composite();
		c.addShape(c1);

		Dreptunghi d1 = new Dreptunghi(5, 4);
		Composite d = new Composite();
		d.addShape(d1);

		Patrat p1 = new Patrat(3);
		Composite p = new Composite();
		p.addShape(p1);

		Triunghi t1 = new Triunghi(3, 4, 5);
		Composite t = new Composite();
		t.addShape(t1);

		Composite all = new Composite();
		all.addShape(c);
		all.addShape(t);
		all.addShape(d);
		all.addShape(p);
		all.showDetails();
	}

}
