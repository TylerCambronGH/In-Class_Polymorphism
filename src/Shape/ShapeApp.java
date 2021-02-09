package Shape;

public class ShapeApp {
	public static void main(String[] args) {
		Circle circle = new Circle(13.2);
		System.out.println("Circle: " + circle.getArea());
		Square square = new Square(2.3);
		System.out.println("Square: " + square.getArea());
		Rectangle rectangle = new Rectangle(3, 5.4);
		System.out.println("Rectangle: " + rectangle.getArea());
	}
}
