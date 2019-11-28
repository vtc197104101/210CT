package week2;

public class Test {
	public static void main(String[] args) {

		Circle circle;
		circle = new Circle(22, 8, 3.5);
		System.out.println(circle.getName() + ": ");
		System.out.println(circle.toString());
		System.out.println("Area = " + circle.getArea());
		circle.setCenter(5, 8);
		circle.setRadius(9);
		System.out.println();
		System.out.println("Modified circle :");
		System.out.println(circle.toString());
		System.out.println("Area = " + circle.getArea());

		System.out.println();

		Square square;
		square = new Square(15, 15, 11);
		System.out.println(square.getName() + ": ");
		System.out.println(square.toString());
		System.out.println("Area = " + square.getArea());
		square.setTopLeft(5, 8);
		square.setWidth(9);
		System.out.println();
		System.out.println("Modified square :");
		System.out.println(square.toString());
		System.out.println("Area = " + square.getArea());
		System.out.println();
	}
}
