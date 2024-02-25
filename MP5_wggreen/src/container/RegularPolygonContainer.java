package container;

public class RegularPolygonContainer extends Container {
	private double side;
	private int numbSides;

	public RegularPolygonContainer(double height, double side, int numbSides) {
		super(height);
		this.side = side;
		this.numbSides = numbSides;
	}

	public double calcTopArea() {
		return numbSides * side * side / (4 * Math.tan(Math.PI / numbSides));
	}
	
	public double calcTopPerimeter() {
		return numbSides * side;
	}

	@Override
	public String toString() {
		return "PolygonContainer [side=" + side + ", numbSides=" + numbSides + ", getHeight()=" + getHeight() + "]";
	}
	
	

}
