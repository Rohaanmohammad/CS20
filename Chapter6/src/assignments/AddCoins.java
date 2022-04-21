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

public class AddCoins {
	
		 public static void getDollarAmount(){    
			 
			 Scanner input = new Scanner(System.in);
			 System.out.println("enter number of coins");
			 int userinput = input.nextInt();
			 double quarters, dimes, nickles, pennies ;
			 
			
			 
			 quarters = 0.25;
			 dimes = 0.10;
			 nickles = 0.05;
			 pennies = 0.01;
			 

			 
			 System.out.println( "quarters: " + quarters * userinput);
			 System.out.println("dimes: " + dimes * userinput);
			 System.out.println("nickles: " + nickles * userinput);
			 System.out.println("pennies: " + pennies * userinput);
			 System.out.println("total: " + quarters + dimes + nickles + pennies * userinput);
		
			  }
		 
		 
		 public static void main(String[] args) {
			 
			 int choose;
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("1. hours to minutes coversion");
				
				
				choose = input.nextInt();
				
				if (choose == 1 ) {
					getDollarAmount();
				}
				else {
					getDollarAmount();
				}
			 
			 
			 
		 }
		 
		 
			
			}    

/* Screen Dump



 */