
package break_Continue;

import java.util.Scanner;

public class allPrimenumber_sol {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int j =2;j<=n;j++){
            boolean divided = false;
            for(int i =2;i<n;i++){
            if(n%i==0){
               divided = true;
                break;
            } 
        if(divided){
            System.out.println(j);
        }          
        }
      }
	}

}
