import java.util.*;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
			
			
			int n = sc.nextInt();
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			a = a/2;
			
			int k = a + b;
			
			if (n > k || n == k) {
				System.out.println(k);
			}
			else{
				System.out.println(n);
			}
						
 						
			}
		}
	}
 