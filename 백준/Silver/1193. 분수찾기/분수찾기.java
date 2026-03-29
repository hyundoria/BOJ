

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = 1;
        int cnt = 0;

        while (true) {

            if  (n <= k) {
                cnt++;
                break;
            }
            else {
                n -= k;
                k++;
                cnt++;
            }

        }

        if (k % 2 != 0) {
            System.out.println((cnt - n + 1) + "/" + n);
        }
        else {
            System.out.println(n + "/" + (cnt-n+1));
        }


    }
}



