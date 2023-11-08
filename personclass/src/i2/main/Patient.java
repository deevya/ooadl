package i2.main;

public class Patient extends Person {

	private int patientId;
	
	public Patient(String name, int patientId) {
		super(name);
		this.patientId=patientId;	
		
	}
	public void displayPatientDetails() {
	System.out.println("Name         : "+super.getName());
	System.out.println("Patient's Id :" +patientId);
}
}
