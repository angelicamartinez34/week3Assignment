//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6

		int[] numbersArray = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
	
		System.out.println( numbersArray [0]);
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println( numbersArray [5]);
		
		System.out.println("-----");
		
		// 4. Print out the element in the array at position 6, what happens?

		//System.out.println( numbersArray [6]);
		
		// 5. Print out the element in the array at position -1, what happens?

			//System.out.println( numbersArray [-1]);
		
		// 6. Write a traditional for loop that prints out each element in the array
	
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.println( numbersArray [i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array 

		System.out.println("-------");
		
		for ( int number : numbersArray) {
			System.out.println(number);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
System.out.println("-----");
		
		
		double sum = 0;
		
		for ( int number : numbersArray) {
			sum += number;
		}
			System.out.println(sum);
		
		// 9. Create a new variable called average and assign the average value of the array to it
System.out.println("----");
		
        double average = sum / numbersArray.length;
			
			System.out.println(average);
        
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
System.out.println("----");
		
			for (int number : numbersArray) {
				if (number % 2 != 0); 
				System.out.println(number);
			}

			
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
System.out.println("----");
		
String[] names = {"Sam", "Sally", "Thomas", "Robert"};

		// 12. Calculate the sum of all the letters in the new array

int sum2 = 0;
 for ( String name : names ) {
	 sum2 += name.length();
 }
		System.out.println(names.length);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greetingFromString("Lisa");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
       System.out.println(greetings("Jack"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
	System.out.println(isStringLongerThanNumber ( " What's up Bob!", 12));
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(ifStringExistsInArray(names, "It is Wednesday."));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(smallestNumberInArray(numbersArray));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] array = {34.0, 26.8, 21.9};
		
		System.out.println(averageOfArray(array));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
         String[] str = {"hey", "hi", "bye", "goodbye"};
        int[] strLengths = stringToInt(str);
				for (int number : strLengths) {
					System.out.println(number);
				}
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	System.out.println(moreEvenThanOdd(str));
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		System.out.println(trueIfPalindrome("racecar"));
		
	}
	

	
	// Method 13:

	public static void greetingFromString( String name) {
	System.out.println("Hello " + name);
	}
		
	// Method 14:

	public static String greetings( String name) {
	return "Hey, " + name + "!";
	}
	// Method 15:

	public static boolean isStringLongerThanNumber( String string, int number ) {
		return string.length() > number; 
	}
	// Method 16:

	public static boolean ifStringExistsInArray( String[] array, String string) {
		for ( String str : array) {
			if ( str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	// Method 17:

	public static int smallestNumberInArray( int[] numbers) {
		int smallest = numbers[0];
		for ( int number : numbers) {
			if ( number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	// Method 18:

	public static double averageOfArray( double[] array) {
		double summ = 0;
		for (double number : array) {
			summ += number;
		}
		return summ / array.length;
	}
	// Method 19:

	public static int[] stringToInt( String[] str) {
	int[] random = new int[str.length];
		for ( int i = 0; i < str.length; i++) {
			random[i] = str[i].length();
		}
		return random;
	}
	// Method 20:
	
	public static boolean moreEvenThanOdd(String[] array) {
	int evenLetters = 0;
	int oddLetters = 0;
		for ( String str : array) {
		if ( str.length() % 2 == 0) {
			evenLetters += str.length();
		} else {
			oddLetters += str.length();
		}
		return evenLetters > oddLetters;
	}
		return true;
	}
	// Method 21:
	
	public static boolean trueIfPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				
			return false;
			
}
	 
}
return true;
}
}