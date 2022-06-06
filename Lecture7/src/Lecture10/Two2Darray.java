package Lecture10;

import java.util.Scanner;
public class Two2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr2D[][] = new int[4][5];
		System.out.println(arr2D[0][3]);
		arr2D[1][1] = 1;
		System.out.println(arr2D[1][1]);
		int arr2[][] = {{1,2,3},{4,5,6}};
		System.out.println(arr2[1][1]);
		
		
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
	    System.out.println("your entered 2D array is");
	    for(int i=0;i<rows;i++) {
	    	for(int j =0;j<columns;j++) {
	    		System.out.print(input[i][j]+" "); 
	    	}
	    	System.out.println();
	    }
		
		
		
		
		
		
		
		

	}

}
