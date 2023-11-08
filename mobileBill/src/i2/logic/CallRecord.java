package i2.logic;

public class CallRecord {

	private long receiverNo;
	private int callDuration;
	private Date date;
	
	public CallRecord(Date date, long number,int duration) {
		this.date=date;
		this.receiverNo=receiverNo;
		this.callDuration=callDuration;
		
	}
	
	public void displayCallRecord() {
		date.displayDate();
		System.out.println(this.getdate()+"\t"+this.receiverNo+"\t" +this.callDuration+"\t");
	}

	public long getReceiverNo() {
		return receiverNo;
	}

	public int getCallDuration() {
		return callDuration;
	}

	public Date getdate() {
		return date;
	}


	}


