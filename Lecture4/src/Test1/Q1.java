package Test1;

import java.util.Scanner;

public class Q1 {

		public static void main(String[] args) {
			// Write your code here
	
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i =1;
	        while(i<=n){
	            int j =1;
	            int num =n;
	            while(j<=n-i){
	                System.out.print(num);
	                num--;
	                j++;
	            }
	            System.out.print("*");
	            
	            int k =1;
	            int last = i-1;
	            while(k<=i-1){
	                System.out.print(last);
	                last--;
	                k++;
	            }
	            System.out.println();          
	            i++;
	        }
		}
	}
