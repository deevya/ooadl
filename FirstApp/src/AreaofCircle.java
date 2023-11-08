import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		System.out.println("Enter radius of circle ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double area = 2 * 3.14 * r * r;
		System.out.println("Area of circle : " + area);

	}
}
