package setmain;

import java.util.Scanner;

public class SetOperationo {
		 public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				// SetInfo SI = new SetInfo();
				int ch = 0;
				System.out.println("Enter the cardinality of Set A and Set B:");
				int cardA = sc.nextInt();
				int cardB = sc.nextInt();
				int setA[] = new int[cardA];
				int setB[] = new int[cardB];
				do {
					
					System.out.println("1)Create\n2)Display\n3)Union\n4)Intersection");
					System.out.println("Enter your Choice...");
					ch = sc.nextInt();
				
					switch (ch) {
					case 1:
						System.out.println("Enter elements in Set A:");
						setA = SetIn.create(setA, cardA);
						System.out.println("Enter elements in Set B:");
						setB = SetIn.create(setB, cardB);
						
						break;
					case 2:
						System.out.println("\t::Set A::");
						SetIn.display(setA, cardA);
						System.out.println("\t::Set B::");
						SetIn.display(setB, cardB);
						
						break;
					case 3:
						

						break;
					case 4:
						break;
					}
					System.out.println("Do You want to continue  1");
					ch = sc.nextInt();
				} while (ch == 1);

			}

		}
