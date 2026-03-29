

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


         for (int i=0; i<t; i++) {
             int n = sc.nextInt();
             int m = sc.nextInt();


             long[] dp = new long[m + 1];

             for (int j = 0; j < n; j++) {
                 dp[j] = 0;
             }

             dp[n] = 1;

             for (int j = n + 1; j <= m; j++) {

                 dp[j] = (dp[j - 1] * j) / (j - n);

             }

             System.out.println(dp[m]);
         }

    }
}
