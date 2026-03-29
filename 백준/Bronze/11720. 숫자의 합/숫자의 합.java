import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
			
			
			int n = sc.nextInt();
			
			String m = sc.next();
			
			int sum = 0;
			
			
			for(int i = 0; i < n; i++) {
				String k = m.substring(i,i+1);
				int j = Integer.parseInt(k);
				sum += j;
			}
			
			System.out.println(sum);
			
			
			}
		}
	}


