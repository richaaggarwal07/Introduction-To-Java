import java.util.Scanner;
public class Sol3 {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        int i =1;
        int n1 = (n/2)+1;
        int n2 =  n/2;
//        while(i<=n1){
//            int j =1;
//            while(j<=n1-i){
//                System.out.print(" ");
//				j++;
//            }
//            j=1;
//            while(j<=(2*i)-1){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//	    i = n2;
//        while(i>=1){
//            int j =1;
//            while(j<=(n2-i+1)){
//                System.out.print(" ");
//                j++;
//            }
//            j=1;
//            while(j<=(2*i)-1){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i--;
//        } 
        
        for(int i=1;i<=n1;i++) {
        	for(int j=1;j<=n1-i;j++) {
        		System.out.print(" ");
        	}
        	for(int j =1;j<=(2*i)-1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for(int i=1;i<=n2;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(" ");
        	}
//        	for(int j=1;j<=2*n2-2*i+1;j++) {
//        		System.out.print("*");
//        	}
        	for(int j=n2;i<=2*n2-1;j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}

