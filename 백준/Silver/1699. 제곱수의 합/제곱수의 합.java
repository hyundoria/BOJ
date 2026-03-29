

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[100_001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i = 4; i<=n; i++){

            int min = dp[i-1] + 1;
            int a =0;


            for (int j=2; j<=Math.sqrt(i); j++) {

                a = Math.min(dp[(i- (int)(Math.pow(j,2)))] + 1, dp[(i-(int)(Math.pow(j-1,2)))] + 1);
                min = Math.min(a, min);

            }

            dp[i] = min;


        }

      
            System.out.println(dp[n]);
        




    }
}