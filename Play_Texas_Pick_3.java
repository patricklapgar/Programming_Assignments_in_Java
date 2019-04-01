/* 
 @author Patrick Apgar
 		 3073052
 
 COSC-1436 Spring 2019
 Week 9
 Assignment 09 - Play Texas Pick 3
 */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Class that will display a play counter after choosing a random 3-digit number
public class Play_Texas_Pick_3 {

//	Method for official play pick three choice and will return a random number 0-999
	public static int officialPlayPick3() {
		final int min = 0;
		final int max = 999;
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	
//	Method for playing the chosen number picks
	public static void playPick3(int myPick3) {
		int playCounter = 0;
		int myPick3Result = 0;
		do {
			myPick3Result = officialPlayPick3();
			if(myPick3Result == myPick3) {
				System.out.println("PlayCounter = " + playCounter);
				break;
			}else {
				playCounter++;
				continue;
			}
		}while (true);
	}
	
//	Main method
	public static void main(String[] args) {
		int myPick3choice;
		Scanner in = new Scanner(System.in);
//		Prompt user for 3-digit number
		System.out.println("Enter your Pick 3 choice: 0-999:");
		myPick3choice = in.nextInt();
		playPick3(myPick3choice);
	}

}
