package Array;

import java.util.Scanner;

public class ArrangeNumbersinArray_sol13542 {

    public static void arrange(int[] arr, int n) {
    	//Your code goes here
    	if(n==0) {
    		return;
    	}
        int val = 1;
        for(int i=0;i<=(n-1)/2;i++){
            arr[i] = val;
            val = val+2;
        }
        if(n%2 == 0) {
        	val = n;
        }
        else {
        	val = n-1;
        }
        
        for(int i=((n-1)/2)+1;i<arr.length;i++){
            arr[i]= val;
            val = val -2;
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
