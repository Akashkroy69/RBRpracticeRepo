package oops;

/*
 * 
 * 
 * 
 * 
 * (The Triangle class) Design a class named Triangle that extends               
GeometricObject. The class contains:                                           
Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.                            
■ A no-arg constructor that creates a default triangle.                        
■ A constructor that creates a triangle with the specified side1, side2, and  
  side3.                                                                                                                                                   
■ The accessor methods for all three data fields.                            
■ A method named getArea() that returns the area of this triangle.             
■ A method named getPerimeter() that returns the perimeter of this triangle.   
■ A method named toString() that returns a string description for the triangle.
                                                                               
The toString() method is implemented as follows:                         
                                                                               
return "Triangle: side1 = " + side1 + " side2 = " + side2 +                    
" side3 = " + side3;   

*
*
*
*
*
*/
public class Triangle {
	
 private double side1;
 private double side2;
 private double side3;
 private java.util.Date dateCreated; 
 public Triangle() {
	side1=1.0;
	side2=1.0;
	side3=1.0;
 }
 public Triangle(double side1,double side2, double side3){
	 
	this.side1 = side1;
	this.side2 = side1;
	this.side3 = side3;
	}
 /// Accessor methods or getters
 public double getside1()
 {
	 return side1;
 }
 
 public double getside2()
 {
	 return side2;
 }
 public double getside3()
 {
	 return side3;
 }
 public double getArea()
 {
	 double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }
 public double getPerimeter() {
	 return side1 + side2 + side3;
}
 public String toString()
 {
	 dateCreated = new java.util.Date();
	 System.out.println("Triangle created on :" + dateCreated);
	 return "Triangle: side1 = " + side1 + " side2 = " + side2 +                    
		 " side3 = " + side3;
	 
 }
 
}
