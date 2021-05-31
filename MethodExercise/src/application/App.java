package application;

import java.util.ArrayList;

public class App {

	/*
	 * EXERCISES FROM https://www.w3resource.com/java-exercises/method/index.php
	 */

	// 1 .find smallest number in numbers array

//	static void findSmallest(int[] numbers) {
//		int x = numbers[0];
//		for (int i : numbers) {
//			if (x > i) {
//				x = i;
//			}
//		}
//		System.out.println("Smallest number in array is " + x + ".");
//	}

	// 2. find average number in numbers array

//	static void findAvg(int[] bele) {
//		int x = 0;
//		int avg = 0;
//		for (int i: bele) {
//			x += i;
//		}
//		x = x / bele.length;
//		System.out.println("Average number of array is " + x + ".");
//	}

	// 3. find middle character in a string

//	static void findMiddle(String bele) {
//		String middle = "";		
//		
//			if (bele.length() % 2 == 0) {
//				middle += bele.charAt(bele.length() / 2 -1);
//				middle += bele.charAt(bele.length() / 2);
//				} else {
//				middle += bele.charAt(bele.length() / 2);
//				
//			}
//			System.out.println("Middle character of a string is " + middle + ".");
//		
//	}

	// 4. count vowels in a string

//	static void countVowels(String bele) {
//		int count = 0;
//		for (int i = 0; i < bele.length(); i++) {
//			if (bele.charAt(i) == 'e' || bele.charAt(i) == 'y' || bele.charAt(i) == 'u' || bele.charAt(i) == 'i'
//					|| bele.charAt(i) == 'o' || bele.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}

	// 5. count words in a string

//	static void countWords(String bele) {
//		int count = 0;
//		for (int i = 0; i < bele.length(); i++) {
//			if (bele.charAt(i) == ' ') {
//				count++;
//			}
//		}
//		count += 1;
//		System.out.println(count);
//	}

	// 6. Write a Java method to compute the sum of the digits in an integer.

//	static void digitsSum(Integer bele) {
//		int length = String.valueOf(bele).length();
//		char a = 0;
//		int galutinis = 0;
//		for(int i = 0; i < length; i ++) {
//			a = String.valueOf(bele).charAt(i);
//			galutinis += Character.getNumericValue(a);
//		}		
//		System.out.println(galutinis);
//		}

	// 7. Write a Java method to display the first 50 pentagonal numbers.

//	static void pentagonal() {
//		int p = 1;
//		int a = 4;
//		int b = 3;
//		ArrayList<Integer> penta = new ArrayList<>();
//
//		for (int i = 0; i < 50; i++) {
//			penta.add(p);
//			p += a;
//			a += b;
//		}
//		int count = 1;
//		for (int i : penta) {
//			System.out.print(String.format("%-6d", i));
//			if(count % 10 == 0) System.out.println();
//			count++;
//		}
//	}

	// 8. Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
	
	static void investmentValue(int investment, int interest, int years ) {
	
		
		
	}
	

	public static void main(String[] args) {

		int[] numbers = { 29, 16, 27, 1, 5, 45, 23 };
		int[] numbers2 = { 23, 454, 12, 65, 95, 35, 238 };
		int number = 123456789;
		
		
		int investment = 1000;
		int interest = 10;
		int years = 5;
		

		String zodis = "mokyklas";
		String sakinys = "The quick brown fox jumps over the lazy dog.";
		// findSmallest(numbers);
		// findAvg(numbers);
		// findMiddle(zodis);
		// countVowels(zodis);
		// countWords(sakinys);
		// digitsSum(number);
		// pentagonal();
		investmentValue(investment, interest, years);
	}
}