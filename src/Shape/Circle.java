package Shape;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	protected double calculateArea() {
		super.area = Math.PI * Math.pow(this.radius, 2.0);
		return super.area;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return this.calculateArea();
	}
}
