import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        long[] dp = new long[1001];

        dp[1] = 1;

        int k = 1;

        for (int i = 2; i < 1001; i++) {

            long step = 2 * dp[k] + ((long)Math.pow(2, i-k) - 1);

            for (int j = k+1; j < i; j++) {

                long val = 2 * dp[j] + ((long)Math.pow(2, i-j) - 1);

                if (val < step) {
                    step = val;
                    k = j;
                }

            }

            dp[i] = step;

        }

        String str = null;

        int i = 1;
        while ((str = br.readLine()) != null) {
            System.out.println("Case " + i + ": " + dp[Integer.parseInt(str)]);
            i++;
        }



    }
}