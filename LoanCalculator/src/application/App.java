package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input first number: ");
		int amount = in.nextInt();

		for (int month = 1; month <= 4; month++) {

			System.out.println(amount);
			amount = amount - (amount / 10);
		}
	}

}