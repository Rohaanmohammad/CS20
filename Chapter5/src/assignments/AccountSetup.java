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

public class AccountSetup {
	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);	
	
		System.out.println("enter a username: ");
		
		String username = input.nextLine();
		
		System.out.println(username);
		
		
		
		System.out.println("enter a password that is at least 8 characters: ");
		
		String password = input.nextLine();
		
		System.out.println(password);
		
		System.out.println("your name is " + username + " and your password is " +  password + ".");
		
		
		
		
		
		
		
		
	}

}
/* Screen Dump
enter a username: 
MattD
MattD
enter a password that is at least 8 characters: 
Programmer7
Programmer7
your name is MattD and your password is Programmer7.


 */