package characterPatterns;

import java.util.Scanner;

public class halfDiamondPattern {

	public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int total = (2*n)-1;
        int n1 = (total/2)+1;
        int n2 = n-n1;
    	int i=1;
        System.out.println("*");
    	while(i<=n1){
            System.out.print("*");
            int j = 1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j =1;
            int num =i-1;
            while(j<=i-1){
                System.out.print(num--);
                j++;
            }
            System.out.print("*");
            System.out.println();
            i++;
        }
        i =n2;
        while(i>=1){
            System.out.print("*");
            int j =1;
            int num =1;
            while(j<=i){
                System.out.print(num++);
                j++;
            }
            num = i;
            while(j<=i-1){
                System.out.print(num--);
                j++;
            }
            System.out.print("*");
            System.out.println();
            i--;
        }
    }
}
