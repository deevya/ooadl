import java.util.Scanner ;

import i2.logic.LinkedListopeartions;
import i2.logic.LinkedListopeartions.Node;
public class LinkedListopeartions{
	 Node head ;
	 static class Node {
	  int data ;
	  Node next ;
	//constructor
	  Node(int d){
		  data = d;
		  next = null ;
	  }
	}



	public static LinkedListopeartions createSLL (LinkedListopeartions list , int data) {
	Node curr_node ;
	Node new_node = new Node(data);
	if(list.head == null){
	  list.head=new_node;
		}
	  else {
			curr_node = list.head;
			while(curr_node.next !=null) {
				curr_node = curr_node.next;
				}
			curr_node.next = new_node;
		}
		return list ;
	}



	public static void printList(LinkedListopeartions list) {
		Node curr_node;
		curr_node = list.head;
//		Node curr_node =list.head;
		System.out.print("\\nThe singly linked list includes element = ");
		while(curr_node !=null) {
			System.out.println( curr_node.data + " ");
			curr_node = curr_node.next;

		}
	}



	public static LinkedListopeartions Insertele(LinkedListopeartions list ) {
		//  Node Newnode = new Node(data);
		 // Newnode.next=null;
		 // list.head=Newnode;
		Node currNode;
		  Scanner input = new Scanner(System.in);
		  int data = 0;

		  System.out.println("\\n Enter the element to be added at the end of the singly linked list");
		  data = input.nextInt();
		  Node Newnode = new Node(data);
		  if(list.head == null) {
			  System.out.println("SLL is empty , so this is the first node in the list ");
		  }
		  else {
			  currNode = list.head ;
			  while(currNode.next !=null) {
				  currNode = currNode.next;
			  }
			  currNode.next = Newnode;
		  }
			  System.out.println("\\n The singly linked list after adding the element at the end           is =");
		  Node curr_node;  
			curr_node = list.head;

			while(curr_node !=null) {
				System.out.println( curr_node.data + " ");
				curr_node = curr_node.next;
			}
		  return list;
	}



	public static LinkedListopeartions Inserteleathead (LinkedListopeartions list ) {

		Node currNode;
		 Scanner input = new Scanner(System.in);
		  int data = 0;

		  System.out.println("\\n Enter the element to be added at the head of the singly linked list");
		  data = input.nextInt();
		  Node Newnode = new Node(data);
		  if(list.head == null) {
			  System.out.println("SLL is empty , so this is the first node in the list ");
		  }
		  else {
			  Node temp = list.head;
			   list.head = Newnode;

				list.head.next = temp;

		  }
		  System.out.println("\\n The singly linked list after adding the element at the head  is =");
		  Node curr_node;
			curr_node = list.head;

			while(curr_node !=null) {
				System.out.println( curr_node.data + " ");
				curr_node = curr_node.next;
			}
		  return list;
	}



	public static LinkedListopeartions Insertinbet (LinkedListopeartions list) {
		int data1 = 0 , key = 0;
		Scanner input1 = new Scanner(System.in);
		System.out.println("\\n Enter the element to be added ");
		data1 = input1.nextInt();
		Node Newnode = new Node(data1);
		System.out.println("\\n Enter the position after which element is to be added");
		key = input1.nextInt();
		 Node currNode;
		 if(list.head == null) {
			  System.out.println("SLL is empty , so this is the first node in the list ");
		  }
		  else {
		  currNode = list.head ;
		  int i = 1;
		  while((currNode.next !=null )&&(key != i)){
		  currNode = currNode.next ;
		  i = i+1;

		  }
		  Newnode.next = currNode.next;
		  currNode.next = Newnode;
		  }
		  System.out.println("\\n The singly linked list after adding the element in between is =");
		  Node curr_node;
			curr_node = list.head;

			while(curr_node !=null) {
				System.out.println( curr_node.data + " ");
				curr_node = curr_node.next;

			}
		return list ;
	}



	public static LinkedListopeartions Deletelastele (LinkedListopeartions list) {
		Node currNode;
		   if(list.head == null) {
			  System.out.println("SLL is empty , so this is the first node in the list ");
		  }
		  else {
			  currNode = list.head ;
			  while(currNode.next.next !=null) {
				  currNode = currNode.next;
			  }
			  currNode.next = null;
		  }
		  System.out.println("\\n The singly linked list after deleting the element at the end is =");
		  Node curr_node;
			curr_node = list.head;

			while(curr_node !=null) {
				System.out.println( curr_node.data + " ");
				curr_node = curr_node.next;

			}
		return list;
	}



	public static LinkedListopeartions Delehead (LinkedListopeartions list) {
		Node currNode;
		if(list.head==null) {
			System.out.println("\\n The Singly Linked list is empty");
		}
		else {
			currNode = list.head;
			currNode = currNode.next;
			list.head.next = null;
			list.head = currNode;
		}
		  System.out.println("\\n The singly linked list after deleting the element at the head is =");
		  Node curr_node;
			curr_node = list.head;

			while(curr_node !=null) {
				System.out.println( curr_node.data + " ");
				curr_node = curr_node.next;
			}
		return list;
	}



	public static LinkedListopeartions Deletenode(LinkedListopeartions list) {
	int key = 0;
	Scanner sc = new Scanner (System.in);
	System.out.println("\n Enter the element to be deleted in the singly linked list");
	key = sc.nextInt();
	Node currNode;
	if(list.head == null) {
	System.out.println("\n The list is empty");
	}
	else {
	currNode = list.head;
	while((currNode.next !=null)&&(currNode.next.data == key)){
	currNode = currNode.next;
	}
	Node temp ;
	temp = currNode.next;
	currNode = temp.next;
	temp.next = null;
	}
	System.out.println("\n The singly linked list after deleting the element at the head is =");
	Node curr_node;
	curr_node = list.head;
	while(curr_node !=null) {
			System.out.println( curr_node.data + " ");
			curr_node = curr_node.next;

		}


	return list ;
	}
			public static void main(String[] args) {
			int ch ,choice ;
			LinkedListopeartions list = new LinkedListopeartions();
			Scanner sc = new Scanner(System.in);
			do {
			System.out.println("---------Welcome to the Singly Linked List Operations--------");
			System.out.println("**\n The operations are \n 1.Create singly linked list");
			System.out.println("**2.Display the singly linked list");
			System.out.println(" 3.Insert element at the head of singly linked list  ");
			System.out.println("**4.Insert the element at the end of singly linked list");
			System.out.println(" 5.Insert element in between the singly linked list");
			System.out.println(" 6.Deletion of last element of the singly Linked List");
			System.out.println("**7.Deletion of first element of the singly linked list");
			System.out.println(" 8.Deletion of the element in between");
			System.out.println("-------------------------------------------------------------");
			System.out.println("\\n Enter the choice ");
			ch = sc.nextInt();
			switch(ch) {
			case 1 :
				do {
				System.out.println("Enter the elements in the Linked list");
				list = createSLL(list , sc.nextInt());
				System.out.println("Do you want to add another element (1=YES/0=NO)");
				choice = sc.nextInt();
				}while(choice == 1);
				break ;
			case 2:
				printList(list);
				break ;
			case 3 :
				list = Inserteleathead(list);
				break;

			case 4:

			//	System.out.println("\\n Enter the element at the end of the linked list");
				    list = Insertele(list);
				//    System.out.println("Do you want to add another element (1=YES/0=NO)");
				//	choice = sc.nextInt();
				//	}while(choice == 1);
					break ;
			case 5 :
				list = Insertinbet(list);
				break ;

			case 6 :
				list = Deletelastele(list);
				break;
			case 7 :
				list = Delehead(list);
				break ;
			case 8 :
				list = Deletenode(list);
				break ;
				default :
					System.out.println("Enter a valid choice");
			}

		}while((ch>0)&&(ch<10));
	}