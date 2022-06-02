//package characterPatterns;
//import java.util.Scanner;
//public class pattern2 {
//   public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	int n = s.nextInt();
//	int i = 1;
//	while(i<=n) {
//		int j =1;
//		char start = 'A';    //char start = (char)('A'+i-1);
//		while(j<=n) {
//			System.out.print((char)(start+i-1));   //System.out.print(start);
//			j++;
//			start++;                               //start = (char)(start+1);
//		}
//		System.out.println();
//		i++;
//	}
//}
//}





package characterPatterns;
import java.util.Scanner;
public class pattern2 {
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i = 1;
	while(i<=n) {
		int j =1;
		char start = (char)('A'+i-1);
		while(j<=n) {
		    System.out.print(start);
			j++;
		    start++;
		}
		System.out.println();
		i++;
	}
}
}







