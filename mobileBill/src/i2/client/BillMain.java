package i2.client;

import i2.logic.MobileBill;
import i2.logic.CallRecord;
import i2.logic.Date;

public class BillMain {

	public static void main(String[] args) {
		
		
		Date d =new Date(11 , 10 , 2021);
		Date d1=new Date(12, 10 , 2021);
		Date d2=new Date(13, 10 , 2021);
		Date d3=new Date(14, 10 , 2021);
		Date d4=new Date(15, 10 , 2021);
		
		CallRecord c =new CallRecord(d,1234567892, 58);
		CallRecord c1=new CallRecord(d1,987654321, 44);
	    CallRecord c2=new CallRecord(d2,194244875, 30);
		CallRecord c3=new CallRecord(d3,192837465, 100);
		CallRecord c4=new CallRecord(d4,192837465, 77);
		
	    Bill b =new Bill();
	    b.addCallRecords(c);
	    
		c.displayCallRecordPerDay();
		d.displayDate();
		System.out.println(d.getdate());
	}
}
