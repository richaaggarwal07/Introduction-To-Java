package if_else;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a  = s.nextInt();
		int rem  = a%2;
//		if(rem == 0) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
		
		if(rem == 0) {
			System.out.println("Even");
			return;
		}
		System.out.println("Odd");
		


	}

}
