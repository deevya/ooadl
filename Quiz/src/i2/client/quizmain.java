package i2.client;

import i2.logic.quiz;

public class quizmain {

	public static void main(String[] args) {
		quiz obj = new quiz(5,100);
	    obj.acceptMarks();
		obj.displayMarks();
	}

}
