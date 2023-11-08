import java.util.Scanner;


public class Circle extends Shape {

	private int radius;
	private double area;
	private double perimeter;
	
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Radius of circle: ");
		double radius = r.nextDouble();
	    double area = Math.PI*radius*radius;
	    System.out.println("Area of circle = " +area);
	    double perimeter = 2* Math.PI*radius;
	    System.out.println("Area of perimeter = " +perimeter);
	} 
	
	
}
