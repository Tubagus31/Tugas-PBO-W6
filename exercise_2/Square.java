package exercise_2;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public String toString() {
		return "A Square with side = " 
				+ super.getWidth()
				+", which is a subclass of " 
				+ super.toString();
	}
	
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side) {
		this.setSide(side);
	}
	
	public void setLength(double side) {
		this.setSide(side);
	}
}
