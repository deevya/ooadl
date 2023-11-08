package i2.main;

public class Bill {
    private static int billNumGenerator=1;
	private int billNum;
	private int billingAmt;
	private Patient patient;
	private Doctor doctor;
	
	public Bill( Patient p, Doctor d) {
		this.doctor=d;
		this.billingAmt=this.doctor.getVisitFees();
		this.billNum=billNumGenerator;
		this.patient=p;
		billNumGenerator++;
		
	  }
	public void displayBillDetails() {
		System.out.println("Bill Number :"+billNum);
		System.out.println("Patient's Name:"+patient.getName());
		System.out.println("Doctor's Name:"+doctor.getName());
		System.out.println("Amount  :"+billingAmt);
	}
	}

