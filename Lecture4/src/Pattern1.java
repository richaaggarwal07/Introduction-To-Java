//import java.util.Scanner;
//public class Pattern1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int i = 1;
//		while(i<=n) {
//			int j =1;
//				int space = 1;
//				while(space<=n-i) {
//					System.out.print(" ");
//					space++;
//					
//				}
//				while(j<=i) {
//				  System.out.print("*");
//				  j++;
//				}
//				
//			   System.out.println();
//			   i++;
//			
//		}
//	}	
//}




import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		int i = 1;
//		while(i<=n) {
//			int j =1;
//				
//				while(j<=n-i) {
//					System.out.print(" ");
//					j++;
//					
//				}
//				j = 1;
//				while(j<=i) {
//				  System.out.print("*");
//				  j++;
//				}
//				
//			   System.out.println();
//			   i++;
//			
//		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	
}


