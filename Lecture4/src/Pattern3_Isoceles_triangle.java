import java.util.Scanner;
public class Pattern3_Isoceles_triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		int i = 1;
//		while(i<=n) {
//			int j =1;
//			while(j<=n-i) {
//				System.out.print(" ");
//				j++;
//			}
//			j=1;
//			while(j<=i) {
//				System.out.print(j);
//				j++;
//			}
//			j =1;
//			int p =i-1;
//			while(j<=i-1) {
//				System.out.print(p);
//				p--;
//				j++;
//				
//			}
//			System.out.println();
//			i++;
//		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
	
			for(int j =i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
				
	}

}
