package Constructor;

public class Person {

	String name;
	int age;
	char gender;
	double height;
	
	public Person (String name, int age, char gender, double height)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		System.out.println("The value of name = " + this.name);
		System.out.println("The value of age is = " + this.age);
		System.out.println("The value of gender = " + this.gender);
		System.out.println("The value of height is = " + this.height);
	}
	public static void main(String[] args) {

       Person p = new Person("mohan",20,'M',5.5);
       
	}

}
