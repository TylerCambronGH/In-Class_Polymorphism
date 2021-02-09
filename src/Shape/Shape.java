package Shape;

public abstract class Shape {
	protected double area;
	
	public Shape() {
		this.area = 0.0;
	}
	
	abstract protected double calculateArea();
} 
