import java.util.Scanner;
public class stack {
	static Node top;
	static class Node{
		int data;
		Node next;
		
	public Node(int data){
		 this.data=data;
		 next = null;
		 
		 
	            }
	 
	 Node(){
		 
	 }
	}
	 public stack() {
		 top = null;
		 
	 }
	                  
	public static void push () {
		Scanner input = new Scanner(System.in);
		System.out.println("\n Enter the element you want to push onto the stack ");
		int d =input.nextInt();
		Node new_node = new Node();
        new_node.data =d; 
		new_node.next =  top;
		top = new_node;
		
		System.out.println("\n Element is added in the stack");
		
		}
	public static void display() {
		Node curr_node;
		curr_node = top;
		while(curr_node != null) {
			System.out.println(curr_node.data);
			curr_node= curr_node.next;
		}
	}
	public static void displaytopelement() {
		Node curr_node;
		curr_node = top;
		while(curr_node.next != null) {
			
			curr_node= curr_node.next;
		}
		System.out.println("The top element of the stack is = " +top.data);
		
	}
	 
	public static void pop() {
		if (top == null) {
			System.out.println("\n The stack is empty");
		}
		else {
			top = top.next;
		//  System.out.println("\n The popped  element is = " +top.next.data);
		  
		  System.out.println("\n The element is popped");
		}
	}
	
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int choice , ch;
		do {
			System.out.println("----------------Stack Operations-----------------------");
			System.out.println("\n 1.Push elements");
			System.out.println(" 2.Display the Stack");
			System.out.println(" 3.Display top element");
			System.out.println(" 4.Pop elements");
			System.out.println("-------------------------------------------------------");
			System.out.println("\n Enter your choice ");
			choice = input1.nextInt();
			switch(choice) {
			case 1:
				do {
				push();
				System.out.println("\n Do you want to push more elements");
				System.out.println("Yes = 1 \nNo = 0");
				ch=input1.nextInt();
				}while(ch==1);
				break;
			case 2:
				display();
				break;
			case 3:
				displaytopelement();
				break;
			case 4:
				pop();
				break;
			default :
				System.out.println("\n Enter a valid choice");
			}
		}while(choice>0 && choice<=7);
	}
	
}