package i2.logic;
import java.util.Scanner;

public class DLLoperations {
	Node head ;
	static class Node {
		char data;
		Node next ;
		Node prev;
		Node(char d){
			data=d;
			next=null;
			prev=null;
			
		}
	}
	public static DLLoperations createDLL (DLLoperations list , char data) {
		Node currnode;
		Node newnode = new Node(data);
	//	newnode.next=null;
	//	newnode.prev=null;
		
		if(list.head == null) {
			list.head=newnode;
		}
		else {
			currnode = list.head;
			while(currnode.next!=null) {
				currnode=currnode.next;
			}
			currnode.next=newnode;
			newnode.prev=currnode;
		}
		
		return list;
	}
	public static void displayDLL(DLLoperations list) {
		Node currnode;
		currnode = list.head;
		if(list.head == null) {
			System.out.println("The list is empty");
		}
		else {
			
			System.out.println("Linkedlist = ");
			while(currnode !=null) {
				
			System.out.println(currnode.data);
				currnode=currnode.next;
			}
		
	}
	
}
	public static void printhead (DLLoperations list) {
		
		if(list.head==null) {
			System.out.println("\n The list is empty");
		}
		else {
			System.out.println("\n The head node of Doubly Linked List is = " + list.head.data);
		}
	}
	public static void printlastnode (DLLoperations list) {
		if(list.head == null) {
			System.out.println("The list is empty");
		}
			else {
				Node currnode ;
		        currnode = list.head;
		        while(currnode.next!=null) {
		        	currnode=currnode.next;
		        }
		        System.out.println("\n The last node of Doubly Linked list is =" + currnode.data);
			}
		
	}
	public static DLLoperations reverseDLL(DLLoperations list) {
		Node currNode;
		currNode = list.head;
		if(list.head == null) {
			System.out.println("list is empty");
		}
		else {
			System.out.println("Reverse DLL is = ");
			while(currNode.next !=null) {
				currNode=currNode.next;
			}
			while(currNode!=null) {
				System.out.println(currNode.data);
				currNode=currNode.prev;
			}
		}
		return list;
	}
	public static DLLoperations deleteNode(DLLoperations list) {
		
		 
			 char key2 = 0;
			 Node current_node=null;
			 Node tmp=null;
			 if(list.head==null)
				{
					System.out.println("DLL is empty");
				}
			 else
			 {
				 Scanner sc = new Scanner(System.in);
				 System.out.println("enter element of node to be deleted");
				 key2=sc.next().charAt(0);
				 if((list.head.data==key2)&&(list.head.next==null))
				 {
					 System.out.println("This is the only node and head node of list so DLL  will be empty");
					 list.head=null;
				 }
				 else//deleting the head node//
				 {
					 if((list.head.next!=null)&&(list.head.data==key2))
					 {
						 Node tmp1;
						 System.out.println("Head node will now change");
						 tmp1=list.head;
						// list.head=tmp1.next;
						 list.head=list.head.next;
						 tmp1.next=null;
						 list.head.prev=null;
					 }
					 else
					 {
						 current_node=list.head;
						 while((current_node.next!=null)&&(current_node.next.data!=key2))
						 {
							 current_node=current_node.next;
						 }
						 tmp=current_node.next;
						 if(tmp.next==null)
						 {
							 current_node.next=null;
							 tmp.prev=null;
						 }
						 else
						 {
							 current_node.next=tmp.next;
							 tmp.next.prev=current_node;
							 tmp.next=null;
							 tmp.prev=null;
						 }			 
					 }		 
			    }
			 }
			 Node currnode;
				currnode = list.head;
				if(list.head == null) {
					System.out.println("The list is empty");
				}
				else {
					
					System.out.println("Linkedlist = ");
					while(currnode !=null) {
						
					System.out.println(currnode.data);
						currnode=currnode.next;
					}
				
			}
			 return list;
		 }
		
		
		
	public static DLLoperations insereleathead (DLLoperations list) {
		char ele  ;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("\n Enter element to be inserted at the head of  the Doubly Linked List");
		ele = sc1.next().charAt(0);
		//Node currNode;
		Node newnode = new Node(ele);
		if(list.head == null) {
			System.out.println("\n The DLL is empty , this is the first node in the list");
			list.head = newnode;
			list.head.prev = null;
			
		}
		else {
			
			list.head.prev = newnode;
			newnode.next=list.head;
			newnode.prev = null;
			list.head=newnode;
	    }
		Node currnode;
		currnode = list.head;
		if(list.head == null) {
			System.out.println("The list is empty");
		}
		else {
			
			System.out.println("Linkedlist = ");
			while(currnode !=null) {
				
			System.out.println(currnode.data);
				currnode=currnode.next;
			}
		
	}
		
		return list;
	}
	public static DLLoperations inseratend (DLLoperations list) {
		char data;
	Scanner sc2 = new Scanner(System.in);
		System.out.println("\n Enter the element to be added at the end");
		data = sc2.next().charAt(0);
		Node currNode;
		Node newnode = new Node(data);
		if(list.head == null) {
			System.out.println("\n The DLL is empty , this is the first node in the list");
		}
		else {
			 currNode = list.head ;
			while(currNode.next!= null ) {
				currNode = currNode.next;
			}
			newnode.next = null;
			currNode.next=newnode;
			newnode.prev=currNode;
		}
		Node currnode;
		currnode = list.head;
		if(list.head == null) {
			System.out.println("The list is empty");
		}
		else {
			
			System.out.println("Linkedlist = ");
			while(currnode !=null) {
				
			System.out.println(currnode.data);
				currnode=currnode.next;
			}
		
	}
		
		return list;
	}
	public static DLLoperations insertinbet (DLLoperations list) {
    Node currnode;
    char data;
    Scanner sc2 = new Scanner(System.in);
    System.out.println("\n Enter element to be inserted in the Doubly Linked list");
    data=sc2.next().charAt(0);
    System.out.println("\n Enter the position after which element is to be inserted");
    int key = sc2.nextInt();
    Node newnode = new Node(data);
    if(list.head==null) {
    	System.out.println("\n The DLL is empty , this is the first element in the DLL");
    }
    else {
    	currnode = list.head;
    	int i =1 ;
	while((currnode.next!=null)&&(key !=i)) {
		currnode = currnode.next;
		i = i + 1;
	}
	newnode.next = currnode.next;
	currnode.next = newnode;
	newnode.prev = currnode;
	newnode.next.prev = newnode;
	
	
    }
  //  Node currnode;
	currnode = list.head;
	if(list.head == null) {
		System.out.println("The list is empty");
	}
	else {
		
		System.out.println("Linkedlist = ");
		while(currnode !=null) {
			
		System.out.println(currnode.data);
			currnode=currnode.next;
		}
	
}
		return list;
	}
	public static DLLoperations delehead(DLLoperations list) {
	
		if(list.head == null) {
			System.out.println("The list is empty");
		}
		else
			{
			Node temp;
			
	
	temp = list.head;
	list.head=temp.next;
	temp.next=null;
	list.head.prev = null;
	temp = null;
			}
	
	
	Node currnode;
	currnode = list.head;
	if(list.head == null) {
		System.out.println("The list is empty");
	}
	else {
		
		System.out.println("Linkedlist = ");
		while(currnode !=null) {
			
		System.out.println(currnode.data);
			currnode=currnode.next;
		}
	
}
		return list ;
	}
	public static DLLoperations delelastele (DLLoperations list) {
		Node currnode;
		if(list.head == null) {
			System.out.println("DLL is empty");
		}
		else {
			currnode = list.head;
			while(currnode.next.next != null) {
				currnode= currnode.next;
			}
			currnode.next = null ;
		}

		//Node currnode;
		currnode = list.head;
		if(list.head == null) {
			System.out.println("The list is empty");
		}
		else {
			
			System.out.println("Linkedlist = ");
			while(currnode !=null) {
				
			System.out.println(currnode.data);
				currnode=currnode.next;
			}
		
	}
		return list;
	}
	public static DLLoperations insertatpost (DLLoperations list) {
	    Node currnode;
	    char data;
	    Scanner sc2 = new Scanner(System.in);
	    System.out.println("\n Enter element to be inserted in the Doubly Linked list");
	    data=sc2.next().charAt(0);
	    System.out.println("\n Enter the position at which element is to be inserted");
	    int key = sc2.nextInt();
	    Node newnode = new Node(data);
	    if(list.head==null) {
	    	System.out.println("\n The DLL is empty , this is the first element in the DLL");
	    }
	    else {
	    	currnode = list.head;
	    	int i =1 ;
		while((currnode.next!=null)&&(key !=i)) {
			currnode = currnode.next;
			i = i + 1;
		}
		
		newnode.next = currnode;
		//currnode.prev = newnode;
		newnode.prev = currnode.prev;
		currnode.prev.next = newnode;
		
		newnode.next.prev = newnode;
		
		
	    }
	  //  Node currnode;
		currnode = list.head;
		if(list.head == null) {
			System.out.println("The list is empty");
		}
		else {
			
			System.out.println("Linkedlist = ");
			while(currnode !=null) {
				
			System.out.println(currnode.data);
				currnode=currnode.next;
			}
		
	}
			return list;
		}
	
	
	public static void main(String[] args) {
		int ch , choice ;
		DLLoperations list = new DLLoperations();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("----------Welcome to Doubly Linked List Operations-------");
			System.out.println("\n1.Create Doubly Linked List \n2.Display Doubly Linked List\n3.Reverse Doubly Linked List\n4.Insert character at head of the doubly linked list");
		    System.out.println("5.Insert at end of the Doubly Linked List");
		    System.out.println("6.Insert a node in between of the Doubly Linked List");
		    System.out.println("7.Delete the head node of Doubly Linked List");
		    System.out.println("8.Delete the last node of Doubly Linked List");
		    System.out.println("9.Delete  a node in between of Doubly Linked List");
		    System.out.println("10.Display the head node of the Doubly linked list");
		    System.out.println("11.Display the last node of the Doubly linked list");
		    System.out.println("12.Insert at a position");
		    System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1 : 
				do {
				//	Scanner in = new Scanner(System.in);
				System.out.println("Enter the elements in Doubly Linked List");
				list = createDLL(list , sc.next().charAt(0));
				System.out.println("Do you want to add elements in Doubly Linked List");
				System.out.println("\n1 = Yes \n0 = No");
	            choice = sc.nextInt();
				}while(choice==1);
				break;
			case 2 :
			 displayDLL(list);
			 break;
			case 3:
				list = reverseDLL(list);
				break;
			case 4 :
				list = insereleathead(list);
				break;
			case 5:
				list = inseratend(list);
			 break;
			case 6:
				list=insertinbet(list);
				break;
			case 7 :
				list=delehead(list);
				break;
			case 8 :
				list = delelastele(list);
				break;
			case 9 :
				list = deleteNode(list);
				break;
			case 10 :
				printhead(list);
				break;
			case 11 :
				printlastnode(list);
				break;
			case 12 :
				list = insertatpost(list);
				break;
			 default :
				 System.out.println("Enter a valid choice");
			}
		}while((ch>0)&&(ch<15));
	}
}