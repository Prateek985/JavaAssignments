package Constructor;

public class Car {

	String make;
	String model;
	int year;
	
	public Car(String make,String model,int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		System.out.println("The Make of car is = "+make);
		System.out.println("The Model of car is = "+model);
		System.out.println("The Year of car is = "+year);
	}
	
	public Car() 
	{
       make = null;
       model = null;
       year = 0;
       System.out.println("The Make of car is = "+make);
		System.out.println("The Model of car is = "+model);
		System.out.println("The Year of car is = "+year);
	}
	public static void main(String[] args) {
		
     Car c1 = new Car();
     System.out.println("-----------------------");
     Car c2 = new Car("Maruti Suzaki","Nexa",2001);
	}

}
