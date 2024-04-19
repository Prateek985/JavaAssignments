package Assignmnets;

public class evenoddfunction {
	
	public boolean evenodd(int no)
	{
		if(no % 2 == 0)
			return true;
		else
		    return false;
		
	}
	public static void main(String[] args) 
	{
		boolean bool;
		evenoddfunction even = new evenoddfunction();
		bool=even.evenodd(4);
		System.out.println(bool);
	}

}
