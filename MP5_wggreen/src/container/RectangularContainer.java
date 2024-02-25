package container;

public class RectangularContainer extends Container {
	private double length;
	private double width;

	public RectangularContainer(double height, double length, double width) {
		super(height);
		this.length = length;
		this.width = width;
	}

	public double calcTopArea() {
		return length * width;
	}

	public double calcTopPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return "RectangularContainer [length=" + length + ", width=" + width + ", getHeight()=" + getHeight() + "]";
	}
	
	
}
