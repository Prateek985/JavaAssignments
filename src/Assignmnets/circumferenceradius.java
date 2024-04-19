package Assignmnets;

import java.util.Scanner;

public class circumferenceradius {

	float pi = 22/7;
	int r=0;
	public float areaofcircle(int r) 
	{
		float area;
		area=pi*r*r;
		return area;
	}
	
	public float circumferenceofcircle(int r) 
	{
		float circum;
		circum=2*pi*r;
		return circum;
		
	}
	public static void main(String[] args) {
		float area,circum;
		circumferenceradius ca = new  circumferenceradius();
		area=ca.areaofcircle(8);
		System.out.println("The area of circle is = "+area);
		circum =ca.circumferenceofcircle(20);
		System.out.println("The circumference of circle is = "+circum);

	}

}
