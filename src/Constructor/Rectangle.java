package Constructor;

public class Rectangle {
      double length;
      double width;
      
      public Rectangle()
      { 
    	this.length = 0.0;
    	this.width = 0.0;
    	System.out.println("The length of the Rectangle  = "+length);
  	    System.out.println("The width of the Rectangle  = "+width);
      }
      public Rectangle(double length, double width) 
      {
    	  this.length = length;
    	  this.width = width;
    	  System.out.println("The length of the Rectangle  = "+length);
    	  System.out.println("The width of the Rectangle  = "+width);
      }
      public double calculateArea(double length, double width) 
      {
    	  double area;
    	  area = length*width;
		 return area;
    	  
      }
      
	public static void main(String[] args) 
	{
		
		Rectangle rec = new Rectangle();
		Rectangle rec1 = new Rectangle(25.6,38.9);
		double area = rec1.calculateArea(14.6, 74.8);
		System.out.println("The area of Rectangle  = "+area);
		
	}

}
