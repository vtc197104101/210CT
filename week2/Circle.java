package week2;

public class Circle extends Shape {

	private Point center;
	private double radius;

	public Circle(double x, double y, double radius) {
		super("Circle");
		center = new Point(x, y);
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setCenter(Point center) {
		center = center;
	}

	public void setCenter(double x, double y) {
		center = new Point(x, y);
	}

	public Point getCenter() {
		return center;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public String toString() {
		return "Radius=" + radius + "  Center=" + center.toString();
	}
}