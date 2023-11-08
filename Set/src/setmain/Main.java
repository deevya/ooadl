package setmain;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter the cardiality of set A");
		
		 int cardA = sc.nextInt();
		 int [] setA = new int [cardA];
		 
		for( int i=0 ;  i< cardA ;i++) {
		System.out.println(" Enter the elements of set A");
		setA[i]= sc.nextInt();
		}
		
		 System.out.println(" Enter the cardiality of set B");
			int cardB = sc.nextInt();
		
		 int [] setB = new int [cardB];
		 
		 System.out.println(" elements of set B");
		 for( int j=0 ;  j< cardA ;j++) {
			System.out.println("  elements of set B");
			setB[j]= sc.nextInt();
		}
		 
		 for(int i =0 ; i< cardA ; i++) {
			 System.out.println(setA[i]); }
			 
		 for(int j =0 ; j< cardB ; j++) {
				 System.out.println(setB[j]);
		 }
		}
}
