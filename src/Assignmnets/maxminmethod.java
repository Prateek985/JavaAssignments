package Assignmnets;

import java.util.Scanner;

public class maxminmethod {

	int a,b,c;
	public int Maxnumber(int a, int b, int c)
	{
		if(a>b && a>c)
			System.out.println("The value of a is greater");
		else if(b>a && b>c)
			System.out.println("The value of b is greater");
		else
			System.out.println("The value of c is greater");
		return c;
		
		
	}
	
	public int Minnumber(int a, int b, int c)
	{
	   
		if(a<b && a<c)
			System.out.println("The value of a is smaller");
		else if(b<a && b<c)
			System.out.println("The value of b is smaller");
		else
			System.out.println("The value of c is smaller");
		return c;
		
	}
	public static void main(String[] args) {
		int c,s;
		maxminmethod mn = new maxminmethod();
		c=mn.Maxnumber(15,98,203);
		System.out.println("The maximum number is = "+c);
		s=mn.Minnumber(42,90,52);
		System.out.println("The minimum number is = "+s);
		
		

	}

}
