package exercise_1;

public class Circle { 
	private double radius;
	private String color;
	
	public Circle() { // 1st (default) constructor
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) { //2nd contructor
		radius = r;
		color = "red";
	}
	
	public Circle(double r, String color) { //3nd contructor
		radius = r;
		color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getArea() { 
		return radius*radius*Math.PI;
	}
	
	public String toString() { 
		return "Circle[radius=" + radius + " color=" + color + "]"; 
	}
}
