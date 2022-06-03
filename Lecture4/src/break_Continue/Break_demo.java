package break_Continue;

import java.util.Scanner;

public class Break_demo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		boolean divided = false;
		int i =2;
		
		/*while(i<n) {
			if(n%i ==0) {
				divided = true;
				break;           //loop will nnot run for all cases it will stop if any one condition occur and saves time
			
			}}
		if(divided) {
			System.out.println("not  a prime");
		}
		else {
			System.out.println("Prime");
		}
		*/
		
		for(i = 2;i<n;i++) {
			if(n%i == 0) {
				divided = true;
				break;
			}	
		}
		if(divided) {
			System.out.println("not  a prime");
		}
		else {
			System.out.println("Prime");
		}
		
		
		
		
	}

}
