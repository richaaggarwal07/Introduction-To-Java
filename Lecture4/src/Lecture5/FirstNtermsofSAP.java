package Lecture5;
import java.util.Scanner;
public class FirstNtermsofSAP {
	
	public static void main(String[] args) {
		// Write your code here

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int term;
        int count = 0;
        int i = 1;
        while(count<x){
            term = (3*i) + 2;
            i++;
            if(term%4 !=0){
            count++;    
            System.out.print(term+" ");
            }
        }
	}
}

