package i2.main;

public class Doctor extends Person {

	private String speciality;
	private int visitFees;
	private Person name;
	
	public Doctor(String name, String speciality, int visitFees) {
		super(name);
		this.speciality=speciality;
		
		this.visitFees=visitFees;	
	}
	
	
	public String getSpeciality() {
		return speciality;
	}


	public int getVisitFees() {
		return visitFees;
	}


	public void displayDoctor() {
		System.out.println("Name       : "+super.getName());
		System.out.println("Speciality :" +speciality);
		System.out.println("Visit fees :" +visitFees);
	}
	
	
}
