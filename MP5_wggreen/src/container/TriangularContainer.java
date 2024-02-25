package container;

public class TriangularContainer extends Container {
	private double sideA;
	private double sideB;
	private double sideC;

	public TriangularContainer(double height, double sideA, double sideB, double sideC) {
		super(height);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double calcTopArea() {
		double s = (sideA + sideB + sideC) / 2;
		return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}

	public double calcTopPerimeter() {
		return sideA + sideB + sideC;
	}

	@Override
	public String toString() {
		return "TriangularContainer [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + ", getHeight()="
				+ getHeight() + "]";
	}

}
