package Exceptions;

import java.util.Scanner;

public class EmployeeName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name");
		String firstName = sc.nextLine();
		System.out.println("Last Name");
		String lastName = sc.nextLine();
		try {
			if (firstName.isEmpty() || lastName.isEmpty()) {// checks whether first or last name is empty
				throw new NullPointerException();
			} else
				System.out.println(firstName + " " + lastName);
		} catch (NullPointerException e) {
			System.out.println("First and Last name should not be empty");
		}

	}
}
