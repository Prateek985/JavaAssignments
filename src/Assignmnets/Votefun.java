package Assignmnets;

public class Votefun {

	public boolean votefuc(int age)
	{
		if(age>=18)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{	
		boolean v;
		Votefun vc= new Votefun();
		v=vc.votefuc(15);
		System.out.println(v);
	}

}
