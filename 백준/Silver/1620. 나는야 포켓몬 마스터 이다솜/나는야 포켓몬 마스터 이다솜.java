import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {


            int n = sc.nextInt();
            int m = sc.nextInt();

            HashMap<String, String> map = new HashMap<String, String>(n);

            String[] arr = new String[n];
            String[] arr1 = new String[m];

            for (int i=0; i<n; i++) {
                arr[i] = sc.next();
            }

            for (int i=0; i<m; i++) {
                arr1[i] = sc.next();
            }

            for (int i=0; i<n; i++) {
                map.put(arr[i],Integer.toString(i+1));
            }


            for (int i=0; i<m; i++) {
                if (arr1[i].charAt(0) >= 'A') {
                    System.out.println(map.get(arr1[i]));
                }
                else {
                    System.out.println(arr[Integer.parseInt(arr1[i])-1]);
                }
            }
            








        }
    }
}