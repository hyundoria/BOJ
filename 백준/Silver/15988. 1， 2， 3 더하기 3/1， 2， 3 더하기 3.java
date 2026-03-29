
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        long[] dp = new long[1000001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int mod = 1000000009;
    
        for (int i = 4; i <= 1000000; i++) {
    
            dp[i] = (dp[i - 1]%mod) + (dp[i - 2]%mod) + (dp[i - 3]%mod);

        }

        for(int i=0; i<t; i++){
            int num = sc.nextInt();
            System.out.println(dp[num] % mod);
        }



        
    }
}