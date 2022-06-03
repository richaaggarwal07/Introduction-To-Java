package break_Continue;

public class Continue_demo {

	
	public static void main(String[] args) {
		int i = 1;
//		while(i<=10) {
//			if(i == 5) {
//				i++;
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
		
		for(i =1;i<10;i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
