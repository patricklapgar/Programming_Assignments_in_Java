/* 
 @author Patrick Apgar
 		 3073052
 
 COSC-1436 Spring 2019
 Week 3
 Assignment 04 - Puerto Rico
 */
import java.util.Scanner;

public class Assignment_04_Puerto_Rico {

	public static void main(String[] args) {
		int myZipCode;
		double myTotalCost;
		final double hotelCharge = 55.00;
		Scanner in = new Scanner(System.in);
		
		//Prompt the user to input zipcode
		System.out.println("Enter zipcode below (only enter three numbers):");
		myZipCode = in.nextInt();
		System.out.println("The zipcode you entered is: " + myZipCode);
		
		//Calculate total cost
		myTotalCost = hotelCharge * 1.06;
		System.out.println("The unformatted total cost is: " + myTotalCost);
		
		//Display formatted zipcode and total cost
		System.out.printf("An area of San Juan PR has a zipcode of %05d \n", myZipCode);
		System.out.printf("The formatted total cost is %.2f", myTotalCost);
	}

}
