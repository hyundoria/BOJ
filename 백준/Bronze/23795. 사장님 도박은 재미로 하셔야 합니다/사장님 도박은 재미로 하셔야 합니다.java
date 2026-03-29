import java.util.*;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
		int a = 0;
		while (true) {		
			int b = sc.nextInt();
			if (b == -1) {
				break;
			}
			a += b;				
		}	
		
		System.out.println(a);
		
		
		
				
		}
	}
}
