package Exceptions;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);//input
		System.out.println("enter age");
		int age=scan.nextInt();
		try {
			if(age<15) {
				throw new NullPointerException();
			   }
			else {
				System.out.println("your age is "+age);
				
			}
		}
		catch(NullPointerException e) {//handling the exception
			System.out.println("age should be greater than 15");
		}
	
	}

}
