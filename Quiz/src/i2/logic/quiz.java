package i2.logic;

import java.io.InputStream;
import java.util.Scanner;

public class quiz {

	private int totalStudents;
	private int maxMarks;
	private int maxMarksObtained[];

	public quiz(int totalStudents, int maxMarks) {
		this.totalStudents = totalStudents;
		this.maxMarks = maxMarks;
		this.maxMarksObtained = new int[totalStudents];
		for (int i = 0; i < maxMarksObtained.length; i++) {
			this.maxMarksObtained[i] = maxMarksObtained[i];
		}
	}
	
	public int getTotalStudents() {
		return totalStudents;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public int[] getMaxMarksObtained() {
		return maxMarksObtained;
	}

	public void acceptMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum marks :");
		this.totalStudents=sc.nextInt();	
		System.out.println("Enter number of students: ");
	
		this.maxMarks = sc.nextInt();
		for (int i = 0; i < maxMarks; i++) {
			System.out.println("Enter marks obtained");
			maxMarksObtained[i] = sc.nextInt();
		}
		sc.close();
	}

	public void displayMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total number of students: " + totalStudents);
		System.out.println("Maximum marks are       :  " + maxMarks);
		System.out.println("Marks obtained : " + maxMarksObtained);
		for (int i = 0; i < maxMarks; i++) {
			System.out.println(maxMarksObtained[i]);

		}
		sc.close();

	}

}
