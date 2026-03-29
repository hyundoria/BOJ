

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] dp = new int[n+1];
        dp[0] = 0;

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();

            dp[i+1] = dp[i] + arr[i];

        }


        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(dp[b] - dp[a-1]);
        }


    }
}



