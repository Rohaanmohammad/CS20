/*

Program: digits.java          Last Date of this Revision: September 30, 2019

Purpose: 

Author: Rohaan 
School: CHHS
Course: Computer science 20
 

*/
package assignments;

import java.util.Scanner;

public class NumbersSum {
	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);	
	//System.out.println("enter number");
		
	//int userinput = input.nextInt();

	//for (int i = 2; i <= 20; i++) {
		//	System.out.println(i);
		//}
			
		int num;
		int sum = 0;
		System.out.println("enter number");
		num = input.nextInt();
		for (; num <= 10; num++) {
			System.out.println(num);
			sum = sum + num;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}

}
/* Screen Dump


 */