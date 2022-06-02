package characterPatterns;
import java.util.Scanner;
public class Pattern1 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i =1;
	while(i<=n) {
		int j =1;
		char ch = 'A';
		while(j<=n) {
			System.out.print(ch); 
			ch++;
			j++;
		}
		System.out.println();
		i++;
	}
}
}
