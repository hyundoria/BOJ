import java.util.Scanner;

public class Main {	 
	public static void main(String[] args)  {
		try (Scanner sc = new Scanner(System.in)) {
			
			
		
			int a1 = sc.nextInt();
			int o1 = sc.nextInt();
			int a2 = sc.nextInt();
			int o2 = sc.nextInt();
			
			int count1 = a1 + o2;
			int count2 = a2 + o1;
			
			if (count1 > count2) {
				System.out.println(count2);
			}
			if (count1 < count2) {
				System.out.println(count1);
			}
			if (count1 == count2) {
				System.out.println(count2);
			}
			
			
			}
		}
	}

