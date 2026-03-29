import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[] dp = new int[w+1];
        
        for(int i=0; i<n; i++) {
            for(int j=w; j>0; j--) {

                if(arr[i][0] > j) {
                    dp[j] = Math.max(dp[j-1], dp[j]);
                }
                else{

                    int ck =  Math.max(dp[j-1], dp[j-arr[i][0]] + arr[i][1]);
                    
                    dp[j] = Math.max(dp[j] , ck);
                }    
            }
        }

        
        System.out.print(dp[w]);
        
        
        
    }
}