/*

Program: digits.java          Last Date of this Revision: September 30, 2019

Purpose: 

Author: Rohaan 
School: CHHS
Course: Computer science 20
 

*/
package assignments;

import java.util.Scanner;

public class TimeConverter {
public static void hourstominutes() {

	double hours, mins;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter time in hours ");
	
	hours = input.nextDouble();
	
	mins = hours * 60;
	
	System.out.println("minutes is: " + mins);
}

public static void daystohours() {

	double hours, days;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number of days: ");
	
	days = input.nextDouble();
	
	hours = days * 24;
	
	System.out.println("hours is: " + hours);
}

public static void minutestohours() {

	double hours, mins;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number of minutes: ");
	
	mins = input.nextDouble();
	
	hours = mins / 60;
	
	System.out.println("hours is: " + hours);
}

public static void hourstodays() {

	double hours, days;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number of hours: ");
	
	hours = input.nextDouble();
	
	days = hours * 2;
	
	System.out.println("number of days is: " + days);
}

public static void main(String[] args) {
	
	int choose;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("1. hours to minutes coversion");
	
	System.out.println("2. days to hours converion");
	
	System.out.println("3. minutes to hours conversion");
	
	System.out.println("4. hours to days conversion");
	
	choose = input.nextInt();
	
	if (choose == 1 ) {
		hourstominutes();
	}
	else {
		daystohours();
	}
	if (choose == 3){
		minutestohours();
	}
	else {
		hourstodays();
	}
	
	
	
	
	
	
	
	
	
}

}
