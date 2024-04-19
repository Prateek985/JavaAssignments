package Assignmnets;

public class Factorialfunc {

	public int fact(int num) {
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	
	public static void main(String[] args) 
	{
		int multi;
		Factorialfunc fa = new Factorialfunc();
		multi=fa.fact(5);
        System.out.println("The factorial of given no is = "+multi);
	}

}
