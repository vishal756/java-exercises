package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//user input
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elemts: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int a = modifyArray(arr);//calls modifyArray Method
		System.out.println("Resultant array: ");
		for (int i = a - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}

	}

	public static int modifyArray(int[] arr) {//logic
		Arrays.sort(arr);
		int n = arr.length;
		int temp[] = new int[n];
		int j = 0;
		for (int i = 0; i < (n - 1); i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];

		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

}


