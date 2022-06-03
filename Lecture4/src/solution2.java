import java.util.Scanner;
public class solution2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n2 = s.nextInt();
		int n;
		n= (n2/2)+1;
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			j= 1;
			while(j<=(2*i)-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		int c = 2;
		while(c<=n) {
			int k=1;
			while(k<=c-1) {
				System.out.print(" ");
				k++;
			}
			
			k=1;
			while(k<=((2*n)-(2*c)+1)) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			c++;
		
	}

}
}
