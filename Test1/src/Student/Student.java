package Student;

public class Student {

	private int rollNo;
	private String lastName;
	private String firstName;
	private char gender;
	private double percentage;

	public Student() {

	}
	
	public Student(int r, String fName, String lName,char g, double score) {
	rollNo=r;
	firstName=fName;
	lastName=lName;
	gender=g;
	percentage=score;
	
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public char getGender() {
		return gender;
	}

	public double getPercentage() {
		return percentage;
	}
}

