
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[][] dp = new long[1001][10];


        dp[0][0] = 0;
        dp[1][0] = 10;
        dp[2][0] = 55;

        for (int i = 1; i < 10; i++) {
            dp[2][i] = i;
        }

        for (int i = 3; i <= n; i++) {
            long sum = 0;

            dp[i][1] = 1;

            for (int j = 1; j < 9; j++) {
                dp[i][j+1] = (dp[i][j]% 10007) + (dp[i-1][j+1] % 10007);
            }

            for (int j = 1; j < 10; j++) {
                sum += dp[i][j];
            }

            dp[i][0] = (sum + dp[i-1][0])% 10007;
        }

        System.out.println(dp[n][0]);

    }
}