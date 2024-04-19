package Constructor;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee(int id,String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		System.out.println("The Id of the employee = "+id);
		return id;
	}

	public String getName() {
		System.out.println("The name of the employee = "+name);
		return name;
	}

	public double getSalary() {
		System.out.println("The salary of the employee = "+salary);
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(double salary) {
		
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee(12145,"roshan", 15000);
		e1.getId();
        e1.getName();
        e1.setSalary(e1.getSalary()*10/100);
        e1.getSalary();

	}

}
