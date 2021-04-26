package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Rewrite following code using do while

		/*
		 * final String USER_PASSWORD = "hello";
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * while(true) { System.out.print("Enter password > "); String password =
		 * scanner.nextLine();
		 * 
		 * if(password.equals(USER_PASSWORD)){ System.out.println("Access granted.");
		 * break; } else { System.out.println("Access denied."); } } scanner.close();
		 */

		final String USER_PASSWORD = "asad";
		Scanner scanner = new Scanner(System.in);
		String password = "";
		do {
			System.out.print("Enter password > ");
			password = scanner.nextLine();
		} while (!password.equals(USER_PASSWORD));
		scanner.close();
		System.out.println("Access granted");
	}

}
