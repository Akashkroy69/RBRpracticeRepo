package oops;
import java.util.Scanner;

import oops.Triangle;
public class Main {
	public static void main(String[] args) {
		Scanner inpScanner= new Scanner(System.in);
	    System.out.println("Enter the side of the Triangle :");
		double side1 = inpScanner.nextDouble();
	    double side2 = inpScanner.nextDouble();
	    double side3 = inpScanner.nextDouble();
	    
	    Triangle triObjTriangle = new Triangle(side1,side2,side3);
	    System.out.println(triObjTriangle.toString());
	    System.out.println("Area of the triangle is : "+triObjTriangle.getArea());
	    System.out.println("Perimeter of the triangle is :"+triObjTriangle.getPerimeter());
	    
	}

}
