package cisse.com;

import java.util.Arrays;

public class CodeProject {
	
	public static String repeatWord (String word, int n) {
		String temp = word;
		for (int i = 0; i < n - 1; i++) {
			word += temp;
		}
		return word;
	}
	
	public static String fullname (String firstName, String lastName) {
		
		return firstName + " " + lastName;
	}
	
	public static boolean isGreaterThan10 (int[] arr) {
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		if (sum > 100) {
			return true;
		}
		
		return false;
	}
	
	public static double average (double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum / arr.length;
	}
	
	public static boolean isGreater (double[] arr1, double[] arr2) {
		
		double avg1 = average(arr1);
		double avg2 = average(arr2);
		
		return avg1 > avg2;
	}
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		
		return isHotOutside && moneyInPocket > 10.5;
	}
	
	public static String longestWord (String sentence) {
		
		String[] arr = sentence.split(" ");
		
		String longest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i].length() > longest.length()) {
				longest = arr[i];
			}
		}
		
		return longest;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

		 //a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		 int diff = ages[ages.length -1] - ages[0];
		 System.out.println(diff);
		 
		 //b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		 int[] ages2 = new int[9];
		 
		 	//	i. Make sure that there are 9 elements of type int in this new array. 
		 for (int i = 0; i < 9; i++) {
			 ages2[i] = i + 10;
		 }

		 	// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		 int diff2 = ages2[ages2.length - 1] - ages2[0];
		 System.out.println(diff2);
		 
		 	// iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

		 //	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 int sum = 0;
		 for (int i = 0; i < 8; i++) {
			 sum += ages[i];
		 }
		 
		 double avge = (double) sum / 8;
		 System.out.println(avge);
		 
	
		 // 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 
		 
		 // a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		 sum = 0;
		 for (int i = 0; i < 6; i++) {
			 sum += names[i].length();
		 }
		 avge = (double) sum / 6;
		 System.out.println(avge);
		 
		 // b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 String str = names[0];
		 for (int i = 1; i < 6; i++) {
			 str = str + " " + names[i];
		 }
		 
		 System.out.println(str);
		 
	// 3. How do you access the last element of any array?
		 /* The last element is at index length - 1. */

	// 4. How do you access the first element of any array?
		 /* The first element is at index 0. */
		 
	// 5. Create a new array of int called nameLengths. 
		 // Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		 int[] nameLengths = new int[6];
		 for (int i = 0; i < 6; i++) {
			 nameLengths[i] = names[i].length();
		 }
		 
		 System.out.println(Arrays.toString(nameLengths));
		 
	// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
		 // Print the result to the console.
		 sum = 0;
		 for (int i = 0; i < 6; i++) {
			 sum += nameLengths[i];
		 }
		 
		 System.out.println(sum);
		 
	// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		 //(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 String st = repeatWord("Hello", 3);
		 System.out.println(st);
		 
	// 8. Write a method that takes two Strings, firstName and lastName, 
		 // and returns a full name (the full name should be the first and the last name as a String separated by a space).
		 st = fullname("John", "Cena");
		 System.out.println(st);
		 
	// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		 int[] arr = {3, 9, 23, 64, 2, 8, 28, 93};
		 System.out.println(isGreaterThan10(arr));
		 
	// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		 double[] array = {1.5, 4.01, 15.9, 41.45, 3.15};
		 System.out.println(average(array));
		 
	// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
		 // is greater than the average of the elements in the second array.
		 double[] array1 = {1.5, 4.01, 15.9, 41.45, 3.15};
		 double[] array2 = {11.5, 0.01, 15.9, 1.45, 5.51};
		 System.out.println(isGreater(array1, array2));
		 
	
	// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		 // and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 boolean isHotOutside = true;
		 double moneyInPocket = 55.1;
		 
		 System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		 
	
	// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 // longest word in a sentence.
		 String sentence = "John goes to supermarket to buy mango";
		 String longest = longestWord (sentence);
		 
		 System.out.println(longest);

		 

	}

}
