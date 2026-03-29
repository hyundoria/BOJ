import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();           
        }

        int[] dp = new int[n+1];

        for (int i=1; i<=n; i++) {
            dp[i] = 10000;           
        }

        dp[1] = arr[0];
        
        for (int i=2; i<=n; i++) {
            for (int j=0; j<i; j++){

                int temp = Math.min(dp[i-j] + dp[j], arr[i-1]); 
                dp[i] = Math.min(dp[i], temp);    
            }
        }
        
        System.out.print(dp[n]);

        
    }
}