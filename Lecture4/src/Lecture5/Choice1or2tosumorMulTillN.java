package Lecture5;
import java.util.Scanner;
public class Choice1or2tosumorMulTillN {
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        int product = 1;
        
        if(c == 1){
                for(int i = 1;i<=n;i++){
                sum = sum+i;
            }}
        if(c==2){
            for(int j = 1;j<=n;j++){
                product = product*j;
            }
            
        } 
            
        if(c ==1){
            System.out.println(sum);
        }    
        else if(c==2){
            System.out.println(product);
        }
        else{
            System.out.println(-1);

        }
        

	}
}