

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j > i) {
                    arr[i][j] = 0;
                    continue;
                }

                if (j == 0 || j == n-1) {
                    arr[i][j] = 1;
                    continue;
                }

                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];

            }
        }


        System.out.println(arr[n-1][k-1]);


    }
}




