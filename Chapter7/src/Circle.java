/*

Program: digits.java          Last Date of this Revision: September 30, 2019

Purpose: 

Author: Rohaan 
School: CHHS
Course: Computer science 20
 

*/

import java.util.Scanner;

public class Circle {
	
	public static void circumference() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter Radius: ");
		
		int userinput = input.nextInt();
		double num = 2;
		double pi = 3.14;
		double Radius = userinput;
		double circumference;
		
		
		circumference = num * pi * Radius;
		System.out.println("circumference is: " + circumference);	

	}
	
	
	
	
	public static void main(String[] args) {
		//Circle spot = new Circle();
		
	//	spot.setRadius(3);
		
		
	//	System.out.println("Circle radius: " + spot.getRadius());	
	//	System.out.println("Circle circumference: " + spot.circumference() );	
		
		
		 
	}







	}

