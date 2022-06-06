package Lecture10;

import java.util.Scanner;

public class LargestColSum {

	
	
	public static int[][] takeInput(){

		System.out.println("enter the no. of rows");
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		System.out.println("enetr the no. of columns");
	    int columns = s.nextInt();
	    int input[][] = new int[rows][columns];
	    for(int i=0;i<rows;i++) {
	    	for(int j =0;j<columns;j++) {
	    		System.out.println("enter the" +i+ "row"+ j +"column element");
	    		input[i][j]= s.nextInt();
	    	}
	    }
	    return input;
	}
	
	
	public static void print2Darray(int[][] input) {
	    int rows = input.length;
	    int columns = input[0].length;
		System.out.println("your entered 2D array is");
	    for(int i=0;i<rows;i++) {
	    	for(int j =0;j<columns;j++) {
	    		System.out.print(input[i][j]+" "); 
	    	}
	    	System.out.println();
	}
	}
	public static int largestcolsum(int[][]input) {
		int row = input.length;
		int columns = input[0].length;
		int largest = Integer.MIN_VALUE;
		for(int j = 0;j<columns;j++) {
			int sum = 0;
			for(int i =0;i<row;i++) {
				sum += input[i][j];
			}
			if(sum>largest) {
				largest = sum;
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = takeInput();
		print2Darray(arr);
		int a = largestcolsum(arr);
		System.out.println(a);
		
	}

}
