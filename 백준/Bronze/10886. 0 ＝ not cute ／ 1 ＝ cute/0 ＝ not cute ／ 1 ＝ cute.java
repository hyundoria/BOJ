import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
		
		
			int N = sc.nextInt();
			
			int arr[] = new int[N];
			
			int count_0 = 0;
			int count_1 = 0;
				
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 0) {
					count_0++;
				}
				else {
					count_1++;
				}
			}
			
			if (count_0 > count_1) {
				System.out.println("Junhee is not cute!");
			}
			else {
				System.out.println("Junhee is cute!");
			}
		
		
		}		
	}
}
