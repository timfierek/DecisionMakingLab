import java.util.Scanner;

/**
 * Decisions takes in user input for a number, and prints a corresponding string
 * based on the number.
 * 
 * @author Tim Fierek
 *
 */
public class Decisions {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = -1;									// Number to be processed (-1 by default)
		String name;									// User's name
		
		// Collect name of user
		System.out.print("Hello! Please enter your name: ");
		name = input.nextLine();
		
		// Collect number from user input, print output, and keep going until user exits
		do {
			
			num = promptInput(input, name);
			printOutput(num, name);
			
		} while(keepGoing(input));
		
		input.close();
		
	}
	
	/**
	 * Prints questions and takes input from user for a number between 1 and 100.
	 * Also checks if the number is in range.
	 * 
	 * @param  in	the scanner object used to collect user input
	 * @param  name the name of the user to be referred to by
	 * @return 		the user entered number between 1 and 100
	 */
	public static int promptInput(Scanner in, String name) {
		int num = -1;
		System.out.print(name + ", Enter a number between 1 and 100: ");
		num = in.nextInt();
		
		// Keep prompting input until number entered is between 1 and 100
		while(num < 1 || num > 100) {
			System.out.print(name + ", Number must be in range (1-100), re-enter: ");
			num = in.nextInt();
		}
		
		return num;
	}
	
	/**
	 * printOutput takes in the number entered by the user and prints the appropriate
	 * output given the number.
	 * 
	 * @param num  the number to be evaluated
	 * @param name name of user to be referred to by
	 */
	public static void printOutput(int num, String name) {
		switch(num % 2){
		case 0:	//Even Number
			if(num <= 25) {
				System.out.println(name + ", Your number is Even and less than 25");
			}
			else if(num <= 60) {
				System.out.println(name + ", Your number is Even");
			}
			else {
				System.out.println(num + " and Even");
			}
			break;
		case 1: //Odd Number
			if(num > 60) {
				System.out.print(name + ", Your number is Odd and over 60");
			}
			else {
				System.out.print(num + " and Odd");
			}
			break;
		}	
	}
	
	/**
	 * keepGoing() assists the main method in continuing until the user no longer wants to.
	 * 
	 * @param in scanner object to be used for user input
	 * @return   true if user enters 'y', false if anything else is entered
	 */
	public static boolean keepGoing(Scanner in) {
		System.out.print("Continue? (y/n): ");
		if(in.next().equalsIgnoreCase("y")) {
			return true;
		}
		
		return false;
	}
}
