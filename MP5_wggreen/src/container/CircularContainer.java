package container;

public class CircularContainer extends Container {

	private double radius;

	public CircularContainer(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	public double calcTopArea() {
		return Math.PI * radius * radius;
	}

	public double calcTopPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "CircularContainer [radius=" + radius + ", getHeight()=" + getHeight() + "]";
	}

}
