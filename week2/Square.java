package week2;

public class Square extends Shape {
	private Point topLeft;
	private double width;
	
	public Square(double x, double y, double w){
		super("Square");
		this.width = w;
		topLeft = new Point(x,y);
	}

	public void setWidth(double width){
		this.width = width;
	}
	public double getWidth(){
		return width;
	}
	public void setTopLeft(Point topLeft){
		this.topLeft = topLeft;
	}
	public void setTopLeft(double x, double y){
		topLeft = new Point(x,y);
	}
	public Point getTopLeft(){
		return topLeft;
	}
	public String toString(){
		return "Width="+ width+"  Topleft="+ topLeft.toString();
	}
	public double getArea() {
		return width * width;
	}
}
