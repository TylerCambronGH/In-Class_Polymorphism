package Shape;

public class Square extends Shape {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	protected double calculateArea() {
		super.area = this.side * this.side;
		return super.area;
	}
	
	public double getSide() {
		return this.side;
	}
	
	public double getArea() {
		return this.calculateArea();
	}
}
