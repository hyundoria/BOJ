

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int t=0; t<n; t++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int[][] arr = new int[a + 1][b + 1];

            for (int i = 1; i <= b; i++) {
                arr[0][i] = i;
            }

            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    int sum = 0;
                    for (int r = 1; r <= j; r++) {
                        sum += arr[i - 1][r];
                        arr[i][r] = sum;
                    }

                }

            }

            System.out.println(arr[a][b]);

        }
    }
}
