
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 5;

        int k = 7;

        for (int i=2; i<=n; i++) {

            dp[i] = (dp[i-1] + k) % 45678;

            k = k+3;

        }

        System.out.println(dp[n]);




    }
}
