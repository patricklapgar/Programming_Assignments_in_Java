import java.util.Scanner;

public class Converter_Class {

	public static void main(String[] args) {
	//	In this class the code below will be able to
	//	convert degrees Celsius to degrees Fahrenheit
	
	//	Declare new variable 'celsius'
		double celsius;
		Scanner in  = new Scanner(System.in);
		
	//	Prompt the user for temperature in celsius
		System.out.print("Type in your temperature in Celsius");
		celsius = in.nextDouble();
	//	Calculate and then display temperature in fahrenheit 
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.printf(" %.1f C = %.1f F", celsius, fahrenheit);

	}

}
