

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int r=0; r<t; r++) {

            int n = sc.nextInt();

            int[] arr = new int[2];

            int min = n - 2;

            loop1:
            for (int i = 2; i <= n; i++) {
                if (i == 2 || i == 3) {
                    if (prnum(n - i)) {
                        int a = n - i;
                        int b = i;
                        if (Math.abs(b - a) <= min) {
                            arr[0] = i;
                            arr[1] = n - i;
                            min = Math.abs(b - a);
                        }
                    }
                    continue;
                }
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        continue loop1;
                    }
                    if (j == (int) Math.sqrt(i)) {
                        if (prnum(n - i)) {
                            int a = n - i;
                            int b = i;
                            if (Math.abs(b - a) <= min) {
                                arr[0] = i;
                                arr[1] = n - i;
                                min = Math.abs(b - a);
                            }
                        }
                    }
                }
            }


            Arrays.sort(arr);
            System.out.println(arr[0] + " " + arr[1]);
        }




    }

    static boolean prnum(int a) {

        boolean ck = true;

        if (a == 1) {
            return false;
        }
        if (a == 2 || a == 3) {
            return true;
        }

        for (int j = 2; j <= Math.sqrt(a); j++) {
            if (a % j == 0) {
                ck = false;
                break;

            }
        }

        return ck;
    }




}
