package Assignmnets;

public class gradedisplay {
	
	public String marksdisplay(int mark)
	{
		String result= "";
		
		if(mark>=91 && mark<=100)
			result= "AA";
		else if(mark>=81 && mark<=90)
			result =  "AB";
		else if(mark>=71 && mark<=80)
			result =  "BB";
		else if(mark>=61 && mark<=70)
			result = "BC";
		else if(mark>=51 && mark<=60)
			result =  "CD";
		else if(mark>=41 && mark<=50)
			result = "DD";
		else if(mark<=40)
			result = "Fail";
		else 
		    result = "Please enter correct no";
		return result;
		
	}

	public static void main(String[] args)
	{
		String data="";
		gradedisplay md= new gradedisplay();
		data = md.marksdisplay(48);
		System.out.println("The result of the student marks = "+data);
		

	}

}
