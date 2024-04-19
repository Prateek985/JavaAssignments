package practice;

import java.util.Scanner;

public class StaticMethod {

	public static void main(String[] args) {


//		try(Scanner scan = new Scanner(System.in)){
//			System.out.println("Enter the value of breath and Height ");
//			int breath = scan.nextInt();
//			System.out.println("Enter the value of Height ");
//			int height = scan.nextInt();
//			try {
//				if(breath <= 0 || height <= 0) {
//					System.out.println("java.lang.Exception: Breadth and height must be positive");
//				}else {
//					int area = breath*height;
//					System.out.println("The Area of parellogram is  = " +area);
//				}	
//			}catch(Exception e){
//				System.out.println(e.getMessage());
//			}
		Scanner sc=new Scanner(System.in);
	    String A=sc.next();
	    /* Enter your code here. Print output to STDOUT. */
	    String reverse="";
	  int length = A.length();   
	  for ( int i = length - 1; i >= 0; i-- )  
	     reverse = reverse + A.charAt(i);  
	  if (A.equals(reverse))  
	     System.out.println("Yes");  
	  else  
	     System.out.println("No");  
	}
			
		}
	
	
