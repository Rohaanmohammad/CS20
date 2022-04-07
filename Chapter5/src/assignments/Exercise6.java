/*

Program: digits.java          Last Date of this Revision: September 30, 2019

Purpose: 

Author: Rohaan 
School: CHHS
Course: Computer science 20
 
done
*/
package assignments;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) 
	{
	
			
		
		long number, sum;  
		
		Scanner input=new Scanner(System.in);  
		
		System.out.print("Enter a positive integer: ");  
		
		 
		
		number=input.nextLong();  
		
		
		for(sum=0; number!=0; number=number/10)  
		
		{  
		
		
			sum = sum + number % 10;  
		
		}  
		
		  
		
		System.out.println("Sum of digits is: " + sum);  
		
		
		
	}

}
/* Screen Dump
Enter a positive integer: 892
Sum of digits is: 19



 */