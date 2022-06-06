package twoD_Array;
import java.util.Scanner;
public class takingInputRowWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter no. of rows");
		int r = s.nextInt();
		System.out.println("enter no. of columns");
		int c = s.nextInt();
		int arr[][] = new int[r][c];
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++) {
				System.out.println("enter the "+i+" row "+j+" column element");
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("the 2D array formed is");
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
