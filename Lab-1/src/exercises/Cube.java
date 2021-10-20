package exercises;

public class Cube {

	public static void main(String[] args) {
		int n=111;
		int x;
		int s=0;
		while(true) {
			if(n>0) {
				x=n%10;
				s=s+x*x*x;
				n=n/10;
				}
			else {
				break;
			}
		}
		System.out.println(s);

	}

}
