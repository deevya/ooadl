package i2.main;

import java.util.Scanner;
import java.util.Stack;

public class framework
{
   public static int main(String[] args)
   {
      int choice;    
      try (Scanner sc = new Scanner(System.in)) {
		Stack<Character> stack = new Stack<Character>();
		  System.out.print("Enter the fuction to perform : ");
		  System.out.println("1. To add elements to stack ");
		  System.out.println("2. To pop elements to stack ");
		  System.out.println("3. To peek elements to stack ");
		  System.out.println("4. To display elements to stack ");
		  System.out.println("5. To check wheteher stack is empty");
		  System.out.println("6. To get stack in postfix formation");
		  choice = sc.nextInt();

		 
		  switch (choice)
		  {
		  case 1 :
		 //to add element to stack
		System.out.println("Element added to stack" +stack.push(null));
   
		     break;

		  case 2 :
		     //to pop elements
		     System.out.println("Element popped out:"  + stack.pop());
		     break;
		     
		  case 3 :
		    //to peek elements
		 System.out.println("The top element is " + stack.peek());
		break;
   
		  case 4 :
		 //display the elements
		 System.out.println("Elements of stack are" +stack);
		 break;
		 
		  case 5 :
		 //to check if stack is empty
		 if (stack.empty()) {
		          System.out.println("The stack is empty");
		      }
		      else {
		          System.out.println("The stack is not empty");
		      }
		 break;
		 
		  case 6 :
		//infix to postfix

		      char ch = 0;
switch (ch)
		      {
		      case '+':
		      case '-':
		          return 1;
		   
		      case '*':
		      case '/':
		          return 2;
		   
		      case '^':
		          return 3;
		      }
		      return -1;
		  }
	}
      return choice;
      }
     
      static String infixToPostfix(String exp)
      {
          String result = new String("");
           

          Stack<Character> stack = new Stack<Character>();
           
          for (int i = 0; i<exp.length(); ++i)
          {
              char c = exp.charAt(i);
               
              if (Character.isLetterOrDigit(c))
                  result += c;
               
              else if (c == '(')
                  stack.push(c);

              else if (c == ')')
              {
                  while (!stack.isEmpty() &&
                          stack.peek() != '(')
                      result += stack.pop();
                   
                      stack.pop();
              }
              else
              {
                  while (!stack.isEmpty() && Prec(c)
                           <= Prec(stack.peek())){
                     
                      result += stack.pop();
               }
                  stack.push(c);
              }
       
          }
       

          while (!stack.isEmpty()){
              if(stack.peek() == '(')
                  return "Invalid Expression";
              result += stack.pop();
           }
          return result;
      }

private static int Prec(Character peek) {
return 0;
     
      
   }
}
