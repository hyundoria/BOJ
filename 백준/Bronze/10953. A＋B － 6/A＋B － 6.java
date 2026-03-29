import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			String[] arr = str.split(",");
			int arr1[] = new int[2];	
				for(int j=0; j<2; j++) {
					arr1[j] = Integer.parseInt(arr[j]);
				}
			System.out.println(arr1[0] + arr1[1]);
		
		}
		
	}

}
