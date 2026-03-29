
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] arr1 = new int[n-1];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        arr1[0] = arr[1] - arr[0];

        int min = arr1[0];

        for (int i=1; i<n-1; i++) {

            arr1[i] = arr[i+1]-arr[i];

            min = gcd(arr1[i], min);

        }

        
        int cnt = 0;

        for (int i=0; i<n-1; i++) {

            int k = arr1[i]/min;

            if (k > 0) {
                cnt += k -1;
            }


        }

        System.out.println(cnt);


    }

    static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }
        return gcd(b,a%b);

    }


}
