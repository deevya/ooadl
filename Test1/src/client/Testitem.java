package client;

import logic.item;

public class Testitem {
	public static void main(String[] args) {
		item i1 = new item("pen", 10);
		System.out.println(i1.getName());
		System.out.println(i1.getPrice());
	}

}
