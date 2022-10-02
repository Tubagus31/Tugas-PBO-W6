package exercise_2;

public class main {
	public static void main (String[] args) {
		Square s1 = new Square(10, "Red", true);
		Rectangle r1 = new Rectangle(10,20);
		Circle c1 = new Circle(10, "Red", false);
		Shape sh1 = new Shape();
		
		System.out.println(s1.toString());
		System.out.println(r1.toString());
		System.out.println(c1.toString());
		System.out.println(sh1.toString());
	}
}
