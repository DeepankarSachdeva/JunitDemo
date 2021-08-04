package OopsDemo3;
// multiple inheritance
class Result extends Candidate implements Exam
{

	
	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		// TODO Auto-generated constructor stub
		int total=(mark1+mark2);
        float percent=total*100/200;
        System.out.println ("Percentage: "+percent+"%");
	}
	
	
void display()
{
    super.display();
}


@Override
public void percentage_cal() {
	// TODO Auto-generated method stub
	
}
}
public class Multipledemo {

	public static void main(String[] args) {
		
		Result r1=new Result("john",101,92,85);
		r1.display();
		r1.Percentage=total*100/200;
		
		
		

	}

}
