package ArrayListConcept;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		
		//ArrayList -- class: default: Dynamic array
		//create the object of ArrayList: new Keyword
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
	//	System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		//System.out.println(ar.size());
		ar.add(500);
		ar.add(600);
		//System.out.println(ar.size());
		
		
		ArrayList<String> emplist = new ArrayList<String>();
		emplist.add("Rahul");
		emplist.add("sonal");
		emplist.add("Hari");
		//System.out.println(emplist);
		
		
		
		ArrayList<Object> empdata = new ArrayList<Object>();
		empdata.add("mukesh");
		
		
		ArrayList<String> footerlink  = new ArrayList<String>();
		//maintains order: order based 
		footerlink.add("Login");
		footerlink.add("Register");
		footerlink.add("contact");
		footerlink.add("feedback");
		footerlink.add(4, "About us");
		//footerlink.add(1, "Company information");
		//footerlink.set(3, "New Events");
		System.out.println(footerlink.size());
		
		System.out.println(footerlink);
		
		//System.out.println("------------------------");
		
		/*
		for(int i=0;i<=footerlink.size()-1;i++)
		{
			System.out.println(footerlink.get(i));
		}
		
		
		
		//System.out.println("------------------------");
		
		for(String e : footerlink)
		{
			System.out.println(e);
		}
		*/


	}

}
