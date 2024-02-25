package container;

public abstract class Container {
	private double height;
	
	public Container (double height) {
		this.height = height;
	}
	
	abstract double calcTopArea();
	
	abstract double calcTopPerimeter();
	
	public double calcVolume() {
		return this.height * calcTopArea();
	}
	
	public double calcSurfaceArea() {
		return 2 * calcTopArea() + height * calcTopPerimeter();
	}

	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Container [height=" + height + "]";
	}
	
	
}
