package setclient;

import java.util.Scanner;

public class SetInto {
	static Scanner sc = new Scanner(System.in);

	public static int[] create(int S1[], int card) {
		for (int i = 0; i < card; i++) {
			S1[i] = sc.nextInt();
		}
		return S1;
	}

	public static void display(int S1[], int card) {
		for (int i = 0; i < card; i++) {
			System.out.print(S1[i] + "\t");
		}

		System.out.println();
	}

}

