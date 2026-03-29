import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
					
			int n = sc.nextInt();
			
			int 창영 = 100;
			int 상덕 = 100;
 			
			for (int i = 0; i < n; i++) {
				int	a = sc.nextInt();
				int	b = sc.nextInt();				
				if (a > b) {
					상덕 -= a;
				}
				else if (a < b) {
					창영 -= b;
				}			
				}
				
			System.out.println(창영);
			System.out.println(상덕);
		
			
		}		
	}
}

