package setoperations;

import java.util.Scanner;

public class main {
public static void main(String[] args) {

	Scanner input=new Scanner(System.in);

System.out.println("Choices are:");
System.out.println("1. Display");
System.out.println("2. Union ");
System.out.println("3. Intersection");
System.out.println("4. Difference");
System.out.println("5. Exit");
System.out.println("Enter your choice");
int choice=input.nextInt();
Scanner sc = new Scanner(System.in);


	main s=new main();
	System.out.println("Cardinality of Set A is");
	int a=input.nextInt();
	int SETA[]=new int[a];
	accept(SETA,a);
	System.out.println("");
	
	
	main s1=new main();
	System.out.println("Cardinality of Set B is");
	int b=input.nextInt();
	int SETB[]=new int[b];
	accept(SETB,b);
	System.out.println("");	
	
	switch(choice) {
	
	case 1: 
		//display
	System.out.println("");
	for( int i=0 ;  i< a ;i++) {
		System.out.println(" Enter the elements of set A" );
		SETA[i]= sc.nextInt();
	}
	
	
	for( int i=0 ;  i< b ;i++) {
		System.out.println(" Enter the elements of set B");
		SETB[i]= sc.nextInt();
		}
	
	System.out.println("-----");
	System.out.println("Elements in Set A" );
	display(SETA,a);
	
	System.out.println("-----");
	System.out.println("Elements in Set B" );
	display(SETB,b);

	break;
	
	
case 2: 
	//union of set
	
	

	break;
	
case 3: 
	//intersection 
	break;


case 4: 
	//difference
	break;


case 5: 
	//
	
	break;

}
}

private static void display(int[] sETA, int a) {
	// TODO Auto-generated method stub
	
}

private static void accept(int[] sETB, int b) {
	// TODO Auto-generated method stub
	
}

}