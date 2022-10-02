package exercise_2;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle (double r) {
		super();
		this.radius = r;
	}
	
	public Circle (double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double perimeter() {
		return 2*radius*Math.PI;
	}
	
	public String toString() {
		return "A Circle with radius = " + this.radius
				+ ", which is a subclass of "
				+ super.toString();
	}
}
