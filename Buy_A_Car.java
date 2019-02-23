/* 
 @author Patrick Apgar
 		 3073052
 
 COSC-1436 Spring 2019
 Week 5
 Assignment 05 - Buy a Car
 */

import java.util.Scanner;

/**
 * Buy a car program that calculates and displays
 * the total cost of buying a certain car along with other variables
 */
public class Buy_A_Car {
//	Method that calculates the total cost
	public static void calculateCost(String carModel, double monthlyPayment, int numOfPaymentMonths) {
		double result = monthlyPayment * numOfPaymentMonths;
		System.out.print("I am looking for a " + carModel + " car that I can pay $" + monthlyPayment);
		System.out.print(" per month for " + numOfPaymentMonths + " months.");
		System.out.println(" My total cost will be $" + result);
	}
	
//	Main method
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("What car model are you looking for?");
		String car = in.nextLine();
		
		System.out.print("How much will you pay per month?");
		double monPayment = in.nextDouble();
		
		System.out.print("How many months are you paying?");
		int expectedMonths = in.nextInt();
		
		calculateCost(car, monPayment, expectedMonths);

	}

}
