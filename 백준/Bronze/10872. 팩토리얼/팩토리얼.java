import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
					
			int n = sc.nextInt();
			
			int pack = 1;
			
			for (int i = 1; i < n+1; i++) {
				pack *= i;
			}
			
			System.out.println(pack);
			
		}		
	}
}

