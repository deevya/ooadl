package i2.main;

public class Student extends Person {

		private int rollNo;
		private String yearofStudy;
		
     public Student(String name, int rollNo, String yearofStudy) {
    		
    	    super(name);
    	    this.rollNo=rollNo;
    	    this.yearofStudy=yearofStudy;
     }
     

	public int getRollNo() {
		return rollNo;
	}

	public String getYearofStudy() {
		return yearofStudy;
	}

			public void displayStudent() {
					System.out.println("Name       : "+super.getName());
					System.out.println("Roll No :" +rollNo);
					System.out.println("Year of Study :" +yearofStudy);
				}
   
     }

