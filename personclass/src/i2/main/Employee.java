package i2.main;

public class Employee extends Person{


	private int id;
	private int yearofJoining;
	
 public Employee(String name, int id, int yearofJoining) {
		
	    super(name);
	    this.id=id;
	    this.yearofJoining=yearofJoining;
 
 }
 
public int getId() {
	return id;
}


public int getYearofJoining() {
	return yearofJoining;
}


		public void displayStudent() {
			System.out.println(" "+this.getName()+"/  "+this.id+"/  "+this.yearofJoining);
				
		}

 }