

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (true) {

            int k = sc.nextInt();

            if (k == 0) {
                break;
            }

            boolean ck = k % n == 0;

            if (ck) {
                System.out.println(k + " is a multiple of " + n + ".");
            }
            else {
                System.out.println(k + " is NOT a multiple of " + n + ".");
            }


        }

    }
}



