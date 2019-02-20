import java.util.Scanner;

public class Number_Converter {

	public static void main(String[] args) {
		int inputSec;
		final int secInMin = 60;
		Scanner in = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Give any number of seconds: ");
		inputSec = in.nextInt();
		
		//calculate the number of hours, minutes, and seconds
		int hour = inputSec / secInMin;
		int minute = hour % secInMin;
		int second = inputSec % secInMin;
		
		hour = hour / 60;
		System.out.print(inputSec + " seconds = " + hour + "  hours, " + minute + " minutes, and " + second + " seconds");
	}

}
