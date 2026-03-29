
import java.util.*;

public class Main {	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			
			double d = sc.nextDouble();
			
			double h = sc.nextDouble();
			double w = sc.nextDouble();
			
			double x = Math.sqrt(Math.pow(h, 2) + Math.pow(w,2));
			
			int k = (int) ((int) d / h);
			int t = (int) ((int) d / w);
			
			System.out.println((int)((d/x) * h) + " " + (int)((d/x) * w));
		
		}										
	}
}
