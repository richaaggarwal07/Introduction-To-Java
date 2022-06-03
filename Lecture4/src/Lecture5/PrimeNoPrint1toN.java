package Lecture5;
import java.util.Scanner;
public class PrimeNoPrint1toN {
        public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i=2;i<=n;i++){
            boolean divided = false;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                	divided = true;
                    break;
                }
            }
            if(divided == false){
                System.out.println(i);
            }    
            }
        
        
        
	}
}