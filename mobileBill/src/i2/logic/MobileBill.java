package i2.logic;
import java.util.ArrayList;

public class MobileBill {
	private long mobileNumber;
	private String custName;
	private String billMonth;
	private int totalCallDuration;
	private ArrayList<CallRecord> listofCallRecords;
	
	public void Bill(long mobileNum,String custName,String billMonth, CallRecord callRecord) {
		this.mobileNumber=mobileNum;
		this.custName=custName;
		this.billMonth=billMonth;
		this.listofCallRecords=new ArrayList<CallRecord>();
	}
	public void addCallRecords(CallRecord callrec) {
		listofCallRecords.add(callrec);
	}
	
	public void displayBill() {
        System.out.println("--------------------------------------------");
		System.out.println("Customer's Name     :"+custName);
		System.out.println("Customer's mobile no:"+mobileNumber);
		System.out.println("Bill Month          :"+billMonth);
		System.out.println("--------------------------------------------");
	    System.out.println("Date           Reciever's Number            Call Duration");
	    for(int i=0;i<listofCallRecords.size();i++) {
	    	listofCallRecords.get(i).displayCallRecord();
			int totalCallDuraton=0;
			totalCallDuration=totalCallDuraton+listofCallRecords.get(i).getCallDuration();
	}
	    
	    System.out.println("--------------------------------------------");
	    System.out.println("Total No. of calls    :" +listofCallRecords.size());
	    System.out.println("Total Call Duration   :"+totalCallDuration +"sec");
	    
	}
	public int getTotalCallDuration() {
		return totalCallDuration;
	}
	public void setTotalCallDuration(int totalCallDuration) {
		this.totalCallDuration = totalCallDuration;
	}
	
	
	}
	
	

