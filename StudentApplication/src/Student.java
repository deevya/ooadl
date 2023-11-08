import java.util.Scanner;
public class Student {

	private int rollNo;
	private String studentName;
	private int sub1, sub2, sub3;
	private float percentage;
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no ");
		rollNo=sc.nextInt();
		System.out.println("Enter name of student:");
		studentName=sc.next();
		System.out.println("Enter marks of 3 subjects");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		sc.close();
		
		
		}
	
    public void calculate(){
    	int total = sub1+sub2+sub3;
    	percentage= total/3;
    	
    }
   
    public void display() {
    	System.out.println("Studenet name :"+studentName);
    	System.out.println("Roll No       :"+rollNo);
    	System.out.println("Marks of sub1 :"+sub1);
        System.out.println("Marks of sub2 :"+sub2);
        System.out.println("Marks of sub3 :"+sub3);
        System.out.println("Percentage    :"+percentage);
    
    }
  
}

