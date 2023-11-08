package student;

import java.io.InputStream;
import java.util.Scanner;

public class Student {
    //attribute declaration
	private int rollNo;
    private double average;
    private int marks[] = new int[5];
    
    
    public Student() {
    Scanner sc = new Scanner(System.in);	
    System.out.println("");
    }
    
    public int getRollNo() {
    	return rollNo;
    }


    public double getAverage() {
    	return average;
    }


    public int[] getMarks() {
    	return marks;
    }
   
    
    public void acceptMarks() {
    	Scanner sc = Scanner(System.in);
    	System.out.println("Enter Roll no. of student: ");
    	int m=0;
    	for(int i=0; i<marks.length; i++) {
         m= sc.nextInt();
         System.out.println(m);
    		marks[i]=m;
    	}
    	sc.close();
    }
    
    

public void display() {
    	System.out.println("Student details");
    	System.out.println("Roll No. is : " +rollNo);
    	System.out.println("Marks of 5 subjects are:");
    	for(int i=0; i<marks.length; i++) {
    		System.out.println(marks[i]);
    	}
    	
    }
    
  public void average() {
	  double sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		average = sum/marks.length;
		
	
  }



}


