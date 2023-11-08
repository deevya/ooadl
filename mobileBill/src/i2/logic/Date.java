package i2.logic;

public class Date {
	private int date;
	private int month;
	private int year;
	
	public Date(int date,int month,int year) {
		this.date=date;
		this.month=month;
		this.year=year;
		
	}
     public int getdate() {
        return date;
     }
     
     public int getmonth() {
         return month;
      }
     
     public int getyear() {
         return year;
      }
     
	public void setDate(int date) {
		this.date = date;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate() {
		System.out.println(" "+this.date+"/  "+this.month+"/  "+this.year);
		
	}
}
