/* 
 @author Patrick Apgar
 		 3073052
 
 COSC-1436 Spring 2019
 Week 9
 Assignment 09 - do While Loop
 */
import java.util.Scanner;

//This class will display a menu item depending on the user's input via the use of a do-while loop
public class Do_While_Loop {
//	Method that will add spacing after a certain answer is selected
	public static void addSpace() {
		System.out.println();
	}
//main method
	public static void main(String[] args) {
		String menuChoice;
		Scanner in = new Scanner(System.in);

//		do-while loop iteration begins here
		do {
//			Display menu options
			System.out.println("A. Deposit Cash");
			System.out.println("B. Withdraw Cash");
			System.out.println("X. Exit");
//			Prompt for user input
			System.out.print("Enter your Selection: ");
			menuChoice = in.next();
			menuChoice = menuChoice.toUpperCase();
//			Conditional statement to decide and display output
			if(menuChoice.equals("A")) {
				System.out.println("Do deposit");
				addSpace();
				continue;
			}else if(menuChoice.equals("B")) {
				System.out.println("Do withdrawal");
				addSpace();
				continue;
			}else if(menuChoice.equals("X")) {
				System.out.println("Bye!");
				addSpace();
				break;
			}else {
				System.out.println("Invalid Selection");
				addSpace();
				continue;
			}
		}while(true);
	}

}
