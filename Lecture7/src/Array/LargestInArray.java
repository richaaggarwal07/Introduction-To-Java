package Array;
import java.util.Scanner;
public class LargestInArray {
	
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = s.nextInt();
		int input[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i =0; i< size;i++) {
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void print(int input[]) {
		for(int i =0;i<input.length;i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static int LargestInArray(int input[]) {
		int max = Integer.MIN_VALUE;
		for(int i =0;i<input.length;i++) {
			if(input[i]>max) {
				max = input[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = takeinput();
		print(arr);
		int largest = LargestInArray(arr);
		System.out.println();
		System.out.println("Largest: " + largest); 
		
		
	}

}
