import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        while(i<=n){
            int j =1;
            while(j<=n-i){
                System.out.print(" ");
				j++;
            }
            j=1;
            while(j<=(2*n)-1){
                System.out.print("*");

                j++;
            }
            System.out.println();

            i++;
        }
	}

}