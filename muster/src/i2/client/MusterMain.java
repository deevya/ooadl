package i2.client;
import i2.logic.MusterManager;
import java.util.Scanner;
public class MusterMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MusterManager M1 =new MusterManager(10);
		
		int[] attendance = new int[M1.getLogOfAttendance()];
		for(int i=0;i<M1.getLogOfAttendance();i++) {
			System.out.println("Enter Attendance Of Day: "+(i+1));
			attendance[i]=sc.nextInt();
			M1.setLogOfAttendance(attendance);
		}
		M1.displayMusterDetails();
	}
}
