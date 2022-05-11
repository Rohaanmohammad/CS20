/*

Program: digits.java          Last Date of this Revision: September 30, 2019

Purpose: 

Author: Rohaan 
School: CHHS
Course: Computer science 20
 

*/

import java.util.Scanner;

public class Adder {
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		


		System.out.println("type a number to start: " );
		int userinput = input.nextInt();
		
		int min = 0;
		int max = 20;
		
		//System.out.println("Random value: " + min + " to " + max + ":");
	      
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	      
		//System.out.println(random_int);
		
		
	    int Min = 0;
		int Max = 20;
		
		//System.out.println("Random value: " + Min + " to " + Max + ":");
	      
		int Random_int = (int)Math.floor(Math.random()*(Max-Min+1)+Min);
	      
		//System.out.println(Random_int);
		
		
		
		int sandom_int = (int)Math.floor(Math.random()*(Max-Min+1)+Min);
		
		int Sandom_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		
		
		
		int sum = random_int + Random_int;
		
		
		
		
		
		System.out.println( random_int + " + " + Random_int + " = "  );
		int Userinput = input.nextInt();
		
		if (sum == userinput) {
			System.out.println( "you get 5 points");
		}
		
		//if (sum == Userinput ) {
		//	System.out.println("you get 5 points" ); 
		//}
		 
		else {
			System.out.println("try again" ); 
		}
		
		
		
		//System.out.println( random_int + " + " + Random_int + " = "  );
		//int serinput = input.nextInt();
		
		
		
		
		 if (sum == userinput ) {
			System.out.println("you get 3 points" ); 
		}
		 
		else {
			System.out.println("try again " );
			}
		
		
		
		
			//System.out.println( random_int + " + " + Random_int + " = "  );
			//int erinput = input.nextInt();
		
			
			
			
			if (sum == userinput ) {
				System.out.println("you get 1 points" ); 
			}
			 
			else{
				System.out.println("wrong, correct answer: " + sum );
				}
		
			
			//if (sum == serinput) {
			//	System.out.println( sandom_int + "+" + Sandom_int);
			//}
			
			
			
			
			
			
			
			
		
			System.out.println( sandom_int + " + " + Sandom_int + " = "  );
			int ginput = input.nextInt();
		
		
	}
}
