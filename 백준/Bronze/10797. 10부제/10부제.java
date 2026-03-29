import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
					
			int n = sc.nextInt();
			
			int arr[] = new int[5];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			int count = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == n) {
					count++;
				}				
			}			
			
			System.out.println(count);
		
		
		}		
	}
}
