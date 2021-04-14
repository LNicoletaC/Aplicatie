package formegeometrice;

import java.util.ArrayList;
import java.util.List;

public class Composite implements ShapeB {

	private List<ShapeB> shapeList = new ArrayList<ShapeB>();

	@Override
	public void showDetails() {
		for (ShapeB sh : shapeList) {
			sh.showDetails();
		}
		System.out.println("\n");
	}

	public void addShape(ShapeB sh) {
		shapeList.add(sh);
	}

	public void removeShape(ShapeB sh) {
		shapeList.remove(sh);
	}

}
