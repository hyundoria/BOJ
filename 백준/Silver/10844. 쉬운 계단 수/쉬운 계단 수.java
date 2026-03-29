import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[][] dp = new long[n+1][10];
        long mod = 1000000000;

        dp[1][0] = 0;
        dp[1][1] = 1;
        dp[1][2] = 1;
        dp[1][3] = 1;
        dp[1][4] = 1;
        dp[1][5] = 1;
        dp[1][6] = 1;
        dp[1][7] = 1;
        dp[1][8] = 1;
        dp[1][9] = 1;
        
        for (int i = 2; i <= n; i++) {

            dp[i][0] = dp[i-1][1];
            dp[i][9] = dp[i-1][8];
            
            for (int j=1; j<9; j++) {

                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;    
                
            }
        }

        long sum = 0;
        
        for (int i = 0; i < 10; i++) {

            sum = (sum + dp[n][i]) % mod;
            
        }

        System.out.print(sum);
        
    }
}