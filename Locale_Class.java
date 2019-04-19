/*
 * Student Name - Patrick Apgar
 * Student ID   - 3073052
 * Semester     - 2
 * Campus       - EL Centro
 * Class        - COSC 1436
 */

import java.util.Locale;
import java.util.Currency;

//Class that will display the language and currency within a different country using the Locale object
public class Locale_Class {

	public static void displayMyLocaleInfo(Locale passedArg) {
//		Currency instance
		Currency currency = Currency.getInstance(passedArg);
		System.out.print("The country " + passedArg.getDisplayCountry());
		System.out.print(" speaks " + passedArg.getDisplayLanguage());
		System.out.print(" and uses the currency " + currency.getDisplayName() + ".");
		System.out.println();
	}
	
//	main method
	public static void main(String[] args) {
//		Four Locale instances with different attributes inside
		Locale unitedStates = new Locale("en", "us");
		Locale greatBritain = new Locale("en", "gb");
		Locale mexico 		= new Locale("es", "mx");
		Locale panama 		= new Locale("es", "pa");

//		A method call to 'displayMyLocalInfo' for each object created above
		displayMyLocaleInfo(unitedStates);
		displayMyLocaleInfo(greatBritain);
		displayMyLocaleInfo(mexico);
		displayMyLocaleInfo(panama);

	}

}
