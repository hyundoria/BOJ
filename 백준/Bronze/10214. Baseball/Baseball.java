import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
					
			int T = sc.nextInt();
			
			for (int i = 0; i < T; i++) {
				int Yonsei = 0;
				int Korea = 0;
				for (int j = 0; j < 9; j++) {
					 Yonsei += sc.nextInt();
					 Korea += sc.nextInt();				
				}
				if (Yonsei > Korea) {
					System.out.println("Yonsei");
				}
				else if (Yonsei < Korea) {
					System.out.println("Korea");
				}
				else if (Yonsei == Korea) {
					System.out.println("Draw");
				}
			}
			
		
			
		}		
	}
}

