import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
					
			
			int arr[] = new int[4];
			int arrr[] = new int[2];
			
			
			for (int e = 0; e < 4; e++) {
				arr[e] = sc.nextInt();
				
			}
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i] > arr[j]) { //오름차순
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			
			
			for (int e = 0; e < 2; e++) {
				arrr[e] = sc.nextInt();
			}			
			if(arrr[0] > arrr[1]) { //오름차순
				int tmp = arrr[1];
				arrr[1] = arrr[0];
				arrr[0] = tmp;
					}
				
			
			
			int sum = arr[1] + arr[2] + arr[3] + arrr[1];
			System.out.println(sum);
			
			
		
			
		}		
	}
}

