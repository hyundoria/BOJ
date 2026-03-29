import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
					
			int n = sc.nextInt();
			
			int sum = 0;
			
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();				
				int c = b % a;
				sum += c;
			}
							
			System.out.println(sum);
		
		
		}		
	}
}

