import java.util.Scanner;
public class AreaofTriangle {

	public static void main(String[] args) {
	System.out.println("Enter base of triangle: ");
	Scanner sc= new Scanner(System.in);
	int base = sc.nextInt();
	System.out.println("Enter height of triagle: ");
	float height= sc.nextFloat();
	double area = base*height/2;
	System.out.println("Area of triangle : "+area);
	}
}
