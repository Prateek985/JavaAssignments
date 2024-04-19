
public class String_Assignment {

	public static void main(String[] args) {
		
		
		String A = "java";//5
		String B = "java";//4
		int String_Length1 = A.length();
		int String_Length2 = B.length();
		int c = String_Length1 + String_Length2;
		System.out.println(c);
		int result = A.compareTo(B);
		if(result<0) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}
		String atemp = A.substring(0,1).toUpperCase()+A.substring(1); 
		String btemp = B.substring(0,1).toUpperCase()+B.substring(1); 
		System.out.println(atemp+" "+btemp);

}

}