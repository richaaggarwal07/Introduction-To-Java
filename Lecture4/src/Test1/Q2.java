package Test1;
import java.util.Scanner;
public class Q2 {


	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
    
    	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=(2*n)+1;j++){
                if(j==i){
                    System.out.print("*");
                }
                else if(j== i+(n-i+1)){
                   System.out.print("*");
                }
                else if(j== i+(n-i+1)+(n-i+1)){
                   System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
		
	}	


}

