import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
					
			int n = sc.nextInt();
			
			int top = -1;
			
			int arr[] = new int[n];
			
			
			
			for (int i = 0; i < n; i++) {
				int number = sc.nextInt();
				
				if (number == 0) {
					arr[top] = 0;
					top--;
				}
				else {
					top++;
					arr[top] = number;
				}
				
			}
			
			int sum = 0;
			
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			
			System.out.println(sum);
			
		}		
	}
}

