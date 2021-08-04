package OopsDemo;
 
public class Complex 
{
		double real;
		double imaginary;
		
		
		Complex(double r,double i)
		{
			real=r;
			imaginary=i;
		}

		void add(Complex obj2)
		{
			this.real+=obj2.real;
			this.imaginary+=obj2.imaginary;
		}
		
		void display()
		{
			System.out.println("r"+this.real+" + i"+this.imaginary);
		}
	}
	

