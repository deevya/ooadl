package i2.logic;

public class MusterManager {
	private int totalFacultyMembers;
    private int[] logOfAttendance;
    public MusterManager(int totalFacultyMembers){
  	  this.totalFacultyMembers=totalFacultyMembers;
  	  this.logOfAttendance= new int[7];
    }

	public int getLogOfAttendance() {
  	  return this.logOfAttendance.length;
    }
    
public void setLogOfAttendance(int[] logOfAttendance) {
		this.logOfAttendance = logOfAttendance;
	}

	  public void displayMusterDetails() {
		  System.out.println("\t::Muster Details::");
		  System.out.println("===========================================");
		  System.out.println("\tTotal Faculty Members: "+totalFacultyMembers);
		  System.out.println("\t1 Log = 1 week Attendance");
		  for(int i=0;i<logOfAttendance.length;i++) {
			  System.out.println("\tAttendance of day-"+(i+1)+": "+logOfAttendance[i]); 
		  }
		  System.out.println("===========================================");
		  
	  }

}