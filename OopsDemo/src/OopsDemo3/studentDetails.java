package OopsDemo3;

public class studentDetails implements CollegeData,HostelData {
	
	College c1=new College("marry",500,"Delhi University","MCA");
	Hostel1 h1=new Hostel1("Ram","Block A");


	
	@Override
	public void hostelDetails() {
		System.out.println("*************Hostel Details******************");
		System.out.println("Hostel Name :"+h1.name);
		System.out.println("Hostel Name :"+h1.location);
		
				
	}
	@Override
	public void collegeDetails() {
		System.out.println("*************College Details******************");
		System.out.println("college Name :"+c1.getName());
		System.out.println("college Name :"+c1.getId());
		System.out.println("college Name :"+c1.university);

				
	}

	@Override
	public void studentData() {
		System.out.println("Student can Join Course : MCA,MTECH,BCA,BTECH");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Student can Join Course : MCA<MTECH<BCA<BTECH");

		
	}
}