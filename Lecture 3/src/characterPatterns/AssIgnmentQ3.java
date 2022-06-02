package characterPatterns;

import java.util.Scanner;

public class AssIgnmentQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        while(i<=n){
            int j =1;
            int num =1;
            int sum = 0;
            while(j<=(2*i)-1){
                if(j%2 != 0){
                    sum += num;
                    System.out.print(num++);
                    
                }
                else{
                    System.out.print("+");
                }
                j++;
            }
            System.out.print("="+sum); 
            System.out.println();
            i++;
        }
    
    }
	}

