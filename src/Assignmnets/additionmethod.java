package Assignmnets;
public class additionmethod {

	
	public int addition(int a ,int b) 
	{
	   int c=0;
		c=a+b;
		return c;
	}
	
	public int Substraction(int a,int b) 
	{
	   int s=0;
		s=a-b;
		return s;	
	}
	
	public int Multiplication(int a, int b) 
	{
	   int m=0;
		m=a*b;
		return m;	
	}
	public int division(int a, int b) 
	{
	   int d=0;
		d=a/b;
		return d;	
	}
	public static void main(String[] args) {
		
        int c,s,m,d;
	   additionmethod add = new additionmethod();
       c=add.addition(45, 74);
       System.out.println("The addition value of c is = "+c);
       s=add.Substraction(95,71);
       System.out.println("The Substraction value of s is = "+s);
       m=add.Multiplication(89,2);
       System.out.println("The Multiplication value of m is = "+m);
       d=add.division(7845,15);
       System.out.println("The division value of d is = "+d);
       
	}

}
