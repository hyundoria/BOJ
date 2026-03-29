
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp0 = new int[41];
        int[] dp1 = new int[41];

        dp0[0] = 1;
        dp1[0] = 0;

        dp0[1] = 0;
        dp1[1] = 1;

        for(int i = 2; i<=40; i++){

            dp0[i] = dp0[i-2] + dp0[i-1];
            dp1[i] = dp1[i-2] + dp1[i-1];

        }


        for (int i=0; i<n; i++) {
            System.out.println(dp0[arr[i]] + " " + dp1[arr[i]]);
        }




    }
}