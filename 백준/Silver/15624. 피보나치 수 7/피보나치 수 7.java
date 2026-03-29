

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = Math.abs(n);

        long[] dp = new long[1_000_001];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i<=m; i++){

            dp[i] = (dp[i-1] + dp[i-2]) %  1_000_000_007 ;

        }

        System.out.println(dp[n]);




    }
}



