package exe2;
import java.util.Scanner;

public class StringRevImage {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String that you want to mirror: ");
		String str = scn.nextLine();
		System.out.println("Mirror String is: "+getImage(str));
		scn.close();
	}
	public static String getImage(String str) {//logic
		String revStr="";
		for(int i= str.length()-1; i>=0;i--) {
			revStr+=str.charAt(i);
		}
		str=str+"|"+revStr;
		return str;
	}

}
