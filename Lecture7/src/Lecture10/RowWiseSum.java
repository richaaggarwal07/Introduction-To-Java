package Lecture10;
import java.util.Scanner;


public class RowWiseSum {
	
	
	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        mat = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j =0;j<columns;j++){
                mat[i][j] = s.nextInt();
            }
        }
        
        
        for(int i=0;i<rows;i++){
            int sum = 0;
            for(int j =0;j<columns;j++){
                sum = sum+mat[i][j];
            }
            System.out.print(sum +" ");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{1,2},{2,3}};
		rowWiseSum(arr);
	}

}
