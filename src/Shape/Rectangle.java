package Shape;

public class Rectangle extends Shape {
	private double length, width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	protected double calculateArea() {
		super.area = this.length * this.width;
		return super.area;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getArea() {
		return this.calculateArea();
	}
}
