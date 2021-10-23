package exe5;
import java.util.Arrays;
import java.util.Scanner;
public class PositiveString {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter a string to check it is positive string or not: ");
		String str= scn.nextLine();
		if(isAlphabaticOrder(str)) {
			System.out.println(str+" is a positive string");
		}
		else {
			System.out.println(str+" is not a positive string");
		}
		

	}
	
	// Method that checks whether the string is in alphabetical order or not
	public static boolean isAlphabaticOrder(String str) {
		
		int length= str.length();
		
		char chars[]= new char[length];
		for(int i=0; i<length; i++) {
			chars[i]= str.charAt(i);
		}
		
		//sort the char array
		Arrays.sort(chars);
		
		//check if the char array is equal to string or not
		for(int i= 0; i<length; i++) {
			if(chars[i]!=str.charAt(i))
				return false;
		}
		return true;
	}

}

