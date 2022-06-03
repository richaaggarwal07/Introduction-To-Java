package Lecture5;
import java.util.Scanner;
public class DedimalToBinary {
	public static void main(String[] args) {
		// Write your code here

//        Scanner s = new Scanner(System.in);
//        long n = s.nextlong();
//        long ans=0;
//        long last,rem;
//        while(n!=0){
//            rem = n%2;
//            ans = ans*10 + rem;
//            n = n/2;
//        }
//        System.out.prlongln(ans);
//        rem = 0;
//        long rev = 0;
//        n = ans;
//        while(n!=0) {
//        	rem = n%10;
//        	rev = rev*10 + rem;
//        	n = n/10;
//        }
//        System.out.prlongln(rev);
//	}
//}
		
		
		 Scanner s = new Scanner(System.in);
	        long n = s.nextlong();
	        long ans=0;
	        long rem = 0;
	        long pv = 1;
	        while(n!=0){
	            rem = n%2;
	            ans = ans + rem*pv;
	            pv = pv*10;
	            n = n/2;
	        }
	        System.out.prlongln(ans);
	      

		}
	}
