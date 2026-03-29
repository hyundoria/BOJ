

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] DP = new int[1001];

        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 1;


        for (int i = 4; i <= n; i++) {

                DP[i] = Math.min(DP[i - 3] + 1, DP[i - 1] + 1);

        }

            if (DP[n] % 2 == 0) {
                System.out.println("CY");
            } else {
                System.out.println("SK");
            }
            

    }
}