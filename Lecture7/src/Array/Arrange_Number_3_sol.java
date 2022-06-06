package Array;

import java.util.Scanner;

public class Arrange_Number_3_sol {
	
	public static void arrange(int[] arr, int n) {
    	//Your code goes here
    	if(n==0) {
    		return;
    	}
        int val = 1;
        int start=0,end=(arr.length) -1;
    
        while(start<end) {
        	arr[start] = val;
        	val++;
        	arr[end] = val;
        	val++;
        	start++;
        	end--;
        }
        if(n%2 != 0) {
        	arr[start] = val;
        }
        
        
        for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
        
    }
    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];
		
		arrange(input, size);
	}

}
