/*

Program: digits.java          Last Date of this Revision: September 30, 2019

Purpose: 

Author: Rohaan 
School: CHHS
Course: Computer science 20
 

*/
package assignments;

import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		
		int num;
		int sum = 0;
		
		System.out.println("enter number");
		
		num = input.nextInt();
		
		for (int i = 2; num >= 1; num--) {
			System.out.println(num--);
			sum = sum + num;
		}
		
		System.out.println("the sum of all the number is: "+sum);
		

		
		 
		
		
		
		
		
	}

}
/* Screen Dump
enter number
11
11
9
7
5
3
1
the sum of all the number is: 30



 */