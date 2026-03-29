
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       long[] dp = new long[1001];
       long mod = 10_007;

       dp[0] = 0;
       dp[1] = 1;
       dp[2] = 3;

        for (int i = 3; i <= n; i++) {

            if (i % 2 == 0) {
               dp[i] = ((dp[i-1]*2)+1) % mod;
            }
            else {
                dp[i] = ((dp[i-1]*2)-1) % mod;
            }


        }

        System.out.println(dp[n]%mod);


    }
}