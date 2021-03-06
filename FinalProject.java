import java.util.Scanner;

public class FinalProject {
	static int age;
	static String gender;
	static int heightInFeet;
	static int additionalHeightInInches;
	static Scanner in = new Scanner(System.in);
	final static double [] BOY = {28.6, 42.2, 49.5, 53.8, 58.0, 61.8, 65.2, 69.0, 72.0, 75.0, 78.0, 81.1, 84.2, 87.3, 91.5, 96.1, 98.3, 99.3, 99.8};
	final static double [] GIRL = {30.9, 44.7, 52.8, 57.0, 61.8, 66.2, 70.3, 74.0, 77.5, 80.7, 84.4, 88.4, 92.9, 96.5, 98.3, 99.1, 99.6, 100.0, 100.0};
	
	public static ChildPercentage[] childData = new ChildPercentage[19];
	
//	Declare class child percentage to hold data on both the boy and the girl
	static class ChildPercentage{
		double boyGrowthPercentage;
		double girlGrowthPercentage;
		
//		constructor for ChildPercentage
		public ChildPercentage(double boyGrowthPercentage, double girlGrowthPercentage) {
			this.boyGrowthPercentage = boyGrowthPercentage;
			this.girlGrowthPercentage = girlGrowthPercentage;
		}

		public double getBoyGrowthPercentage() {
			return boyGrowthPercentage;
		}

		public void setBoyGrowthPercentage(double boyGrowthPercentage) {
			this.boyGrowthPercentage = boyGrowthPercentage;
		}

		public double getGirlGrowthPercentage() {
			return girlGrowthPercentage;
		}

		public void setGirlGrowthPercentage(double girlGrowthPercentage) {
			this.girlGrowthPercentage = girlGrowthPercentage;
		}

		@Override
		public String toString() {
			return "ChildPercentage [boyGrowthPercentage=" + boyGrowthPercentage + ", girlGrowthPercentage="
					+ girlGrowthPercentage + "]";
		}
	}
	
	
	
//	Outside of 'ChildPercentage' class
	
//	This method will input the various values from the hardcoded 'BOY' and 'GIRL' arrays into the 'childData' array
	public static void inputData(double [] boy, double [] girl, ChildPercentage[] data) {
		for(int idx = 0; idx < data.length; ++idx) {
			childData[idx] = new ChildPercentage(boy[idx], girl[idx]);
		}
	}
	
//	This method is going to convert the input height in feet and inches to inches
	public static int getHeight(int feet, int inches) {
		return (feet * 12) + inches;
	}
	
// This method will go ahead and iterate through the newly valued 'childData' array and find retrieve
// the data associated with the child's height and age. The result will be what the child's height is at that certain age.
	public static void searchAndDisplayData() {
		double num = 0.0;
		String decision;
		
		do {
			System.out.println("What is the child's age?");
			age = in.nextInt();
			System.out.println("Is the child a boy or a girl? ");
			gender = in.next();

// Here is a conditional that will decide if to access the boy array or girl array
			if(gender.toLowerCase().equals("boy")) {
				num = childData[age].getBoyGrowthPercentage();
			}else if(gender.toLowerCase().equals("girl")) {
				num = childData[age].getGirlGrowthPercentage();
			}
			
//			Prompt for child's information such as height in feet/inches
			System.out.println("What is the child's height in feet? ");
			heightInFeet = in.nextInt();
			System.out.println("Is there any additional height in inches (Type a number please)? ");
			additionalHeightInInches = in.nextInt();
			
			int heightToUse = getHeight(heightInFeet, additionalHeightInInches);
			double result = heightToUse * (100/num);

//			Display result
			System.out.print("Your " + gender + " will be ");
//			The result variable is divided by 12 to give the output in terms of feet and 
//			the remainder is displayed to give the remaining inches
			System.out.printf("%.0f feet and %.0f inches as an adult", result/12, result % 12);
			System.out.println();
			
//			Prompt for retry
			System.out.println("Would you like to continue (y/n) ? ");
			decision = in.next();
			if(decision.equals("y")) {
				continue;
			}else if(decision.equals("n")) {
				System.out.println("Thank you!");
				break;
			}
			
		}while(true);
	}
	
	public static void main(String[] args) {
		inputData(BOY, GIRL, childData);
		searchAndDisplayData();
		
	}

}
