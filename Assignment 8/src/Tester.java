//Dylan Blackmer	Tester

//imports
import java.util.Scanner;

public class Tester {

	static Scanner input = new Scanner(System.in);
	public static String yesNo = "";
	
	public static void palindromeTest() {
		
		String word = "";
		System.out.print("Welcome to the Palindrome tester!\nPlease enter the word you'd like to test.\nWord: ");
		word = input.nextLine().toLowerCase();
		System.out.println("\n" + word);
		
		String plainWord = word.replace(" ", "");
		plainWord = plainWord.replace("'", "");
		plainWord = plainWord.replace(",", "");
		
		String palindrome = "";
		for (int i = 0; i <= plainWord.length() - 1; i++) {
			palindrome += plainWord.substring(i, i + 1);
		}
		
		if (palindrome.equals(plainWord)) {
			System.out.println("Your word, " + word + ", is a palindrome!");
		} else {
			System.out.println("Sorry! " + word + " is not a palindrome.");
		}
		
		repeatTester();
		if (yesNo.contentEquals("y") || yesNo.contentEquals("N")) {
			palindromeTest();
		} else if (yesNo.contentEquals("n") || yesNo.contentEquals("N")) {
			System.out.println("\nHave a good one!!");
		} else {
			System.out.println("Error, invalid input. Please press enter to try again.");
		}
		
		
	}
	
	public static void repeatTester() {
		System.out.print("\nWould you like to test another word? (Y/N)");
		yesNo = input.next();
	}
	
}
