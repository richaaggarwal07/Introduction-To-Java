package Lecture10;

import java.util.Scanner;

public class two2DarrayFunctions {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int arr[][] = takeInput();
		print2Darray(arr);
		
	}

}
