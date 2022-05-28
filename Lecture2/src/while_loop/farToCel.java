package while_loop;
import java.util.Scanner;

public class farToCel {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        int w = scan.nextInt();
        int c = 0;
        
        while(s<=e){
            c = (5*(s-32)/9);
//            c = (5.0/9)*(s-32);   what problem in this -- it is casting float into int //
            System.out.println(s+"\t"+c);
            s = s+w;
            
        }
        
        
		
	}

}
