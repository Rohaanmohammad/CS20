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

public class PrimeNumber {
	
		 public static void main(String args[]){    
			 
			 Scanner input = new Scanner(System.in);
			 System.out.println("enter number");
			 int num = input.nextInt();
			    boolean num1 = false;
			    for (int i = 2; i <= num / 2; ++i) {
			     
			      if (num % i == 0) {
			        num1 = true;
			        break;
			      }
			    }

			    if (!num1)
			    	System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			  }
			
			}    

/* Screen Dump



 */