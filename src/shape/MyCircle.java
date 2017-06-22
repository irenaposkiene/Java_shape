package shape;

import com.eisgroup.javaexam.shapes.Shape;

public class MyCircle implements Shape {
	
	private double radius;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = Math.pow(radius, 2)*Math.PI;
		return area;
	}

}
