import java.util.Scanner;

public class calculator {
  public static void main(String[] args)
  {
	  int operator;
	  double num1, num2;
	  double result = 0;
	  Scanner sc= new Scanner(System.in);
	  do {
		  System.out.println("Choose operator");
		  System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Exit ");
		  
		  operator = sc.nextInt();
		  
		  System.out.println("Enter two numbers");
		  num1 = sc.nextDouble();
		  num2 = sc.nextDouble();
		 
		  switch(operator) {
		  case 1:
	      result = num1+num2;
		  System.out.println("Addition is :" +result);
		  break;
		  
		  case 2: 
	      result = num1-num2;
		  System.out.println("Subtraction is :" +result);
		  break;
		  
		  case 3: 
			  result = num1*num2;
		  System.out.println("Multiplication is :" +result);
		  break;
		  
		  case 4: 
			  result = num1/num2;
		  System.out.println("Division is :" +result);
		  break;
		  
		  default:
			  System.out.println("Invalid operator");
			  
		  }
		  System.out.println();
	  }while(operator!=5);
	  
	  
  }
}
