/*

Program: digits.java          Last Date of this Revision: September 30, 2019

Purpose: 

Author: Rohaan 
School: CHHS
Course: Computer science 20
 

*/
package rectangleperimeter;

import java.util.Scanner;

public class digits {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("enter two digits: ");
	
		int userinput = input.nextInt();
		
		int tens = (userinput % 100) / 10;
		int ones = (userinput % 100) % 10; 
		
		System.out.println("The first digit is: "+ tens);
        
        System.out.println("The second digit is: "+ ones);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
/* Screen Dump


 */