

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long re = 0;

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i=0; i<n; i++) {
            if (arr[i]-b > 0) {
                re++;
                re += ((arr[i] - b) / c);
                if ((arr[i]-b)%c != 0) {
                    re++;
                }
            }
            else {
               re++;
            }
        }

        System.out.println(re);

    }
}