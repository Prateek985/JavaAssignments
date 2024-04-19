package Assignmnets;
public class decimalmethod {

	
	public double product(int a, int b)
	{
		double p;
		p = a*b;
		return p;
		
	}
	public static void main(String[] args) {
	     double p;
		decimalmethod dc = new decimalmethod();
		p=dc.product(4157,7451);
		System.out.println("The product value of p is = "+p);
     
	}   

}
