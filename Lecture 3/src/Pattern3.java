import java.util.Scanner;
public class Pattern3 {
      public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i++;
		}
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(n-j+1);
//			}
//			System.out.println();
//		}
	}
}

