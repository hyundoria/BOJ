import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
			
			
			int arr[] = new int[3];
				
			for (int i=0; i<3; i++) {
				arr[i] = sc.nextInt();
			}
			
			int tmp = 0;
			
			for (int i=0; i<3; i++) {
				for (int j=i; j<3; j++) {
					if (arr[i] > arr[j]) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
							
					}
				}
			}
			
			System.out.println(arr[1]);
			
			
			
			}
		}
	}


