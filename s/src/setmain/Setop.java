package setmain;

import java.util.Scanner;

public class Setop {
	Scanner in = new Scanner(System.in);

	public int[] accept(int arr[], int n) {
		int change;
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++)
			arr[i] = in.nextInt();
		for (int j = 0; j < n; j++) {
			if (arr[j] == arr[j + 1]) {
				System.out.println("Enter distinct elements only " + arr[j]);
				change = in.nextInt();
				arr[j] = change;
			}
		}
		return arr;

	}

	public void display(int arr[], int n) {
		System.out.println("Cardinality of the set:\n" + n);
		System.out.println("Elements of the set:");
		for (int z = 0; z < n; z++)
			System.out.println(arr[z]);
		System.out.println("");

	}

	public int union(int arrA[], int arrb[], int na, int nb, int arru[]) {
		int flag, k = na;
		for (int i = 0; i < na; i++) {
			arru[i] = arrA[i];
		}

		for (int z = 0; z < nb; z++) {
			flag = 0;
			for (int j = 0; j < na; j++) {
				if (arrb[z] == arrA[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				arru[k] = arrb[z];
				k++;
			}

		}
        return k;

	}
	public int intersection(int arra[], int arrb[], int na, int nb, int arri[]) {
		int  k =0;
		

		for (int z = 0; z < na; z++) {
			
			for (int j = 0; j < nb; j++) {
				if (arrb[z] == arra[j]) {
					arri[k] = arrb[z];
					k++;
				}
			}
			

		}
        return k;

	}
	public int difference(int setA[], int setB[], int na, int nb, int arrd[]) {
		int flag, k=0;
		for (int z = 0; z < na; z++) {
			flag = 0;
			for (int j = 0; j < nb; j++) {
				if (setA[z] == setB[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				arrd[k] = setA[z];
				k++;
			}

		}
        return k;

	}
	
	
	
	

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Setop ob = new Setop();
		int arr1[] = new int[50];
		int arr2[] = new int[50];
		int arrun[] = new int[50];
		int arrin[] = new int[50];
		int diffA[] = new int[50];
		int diffB[] = new int[50];
		int symmetric[] = new int[50];

		int choice, cardA, cardB, cardU, cardI, cardDa=0, cardDb=0, cardSD;

		System.out.println("Enter the cardinality of set A");
		cardA = in.nextInt();

		System.out.println("\nEnter the cardinality of set B");
		cardB = in.nextInt();
		
	
		System.out.println("\nFor set A:");
		arr1 = ob.accept(arr1, cardA);

		System.out.println("\nFor set B:");
		arr2 = ob.accept(arr2, cardB);

		do {
			System.out.println(
					"\nEnter your choice:\n\n1.Display\n2.Union\n3.Intersection\n4.Difference\n5.Symmetric Difference");
			choice = in.nextInt();
			switch (choice) {

			case 1:
				System.out.println("\nFor set A:");
				ob.display(arr1, cardA);
				System.out.println("For set B:");
				ob.display(arr2, cardB);
				break;

			case 2:
				cardU = ob.union(arr1, arr2, cardA, cardB, arrun);
				System.out.println("Union set of set A and set B\n");
				ob.display(arrun, cardU);
				break;

			case 3:
				cardI = ob.intersection(arr1, arr2, cardA, cardB, arrin);
				System.out.println("Intersection set of set A and set B\n");
				ob.display(arrin, cardI);
				break;
				
			case 4:
				System.out.println("Enter 1 to find set A-B\nEnter 2 to find set B-A");
				int diffch = in.nextInt();
				cardDa = ob.difference(arr1, arr2, cardA, cardB, diffA);
				cardDb = ob.difference(arr2, arr1, cardB, cardA, diffB);
				if (diffch == 1) {
					System.out.println("Difference set A-B\n");
					ob.display(diffA, cardDa);
				}
				if (diffch == 2) {
					System.out.println("Difference set B-A\n");
					ob.display(diffB, cardDb);
				}
				break;

		   case 5:
				cardSD = ob.union(diffA, diffB, cardDa, cardDb, symmetric);
				System.out.println("Symmetric difference between set A and set B is\n");
				ob.display(symmetric, cardSD);
				break;

            default:
				System.out.println("Thank you");

			}

		} while (choice >= 1 && choice <= 5);
	}
}

