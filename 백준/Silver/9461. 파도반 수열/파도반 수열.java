

import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            int n = sc.nextInt();

            long n1 = 1;
            long n2 = 1;
            long n3 = 1;
            long sum1 = 0;
            long sum2 = 0;

            if (n == 1) {
                System.out.println(n1);
                continue;
            } else if (n == 2) {
                System.out.println(n2);
                continue;
            } else if (n == 3) {
                System.out.println(n3);
                continue;
            }

            for (int j = 0; j < n-3; j++) {
                if (j % 2 == 0) {
                    sum1 = n1 + n2;
                    sum2 = n2 + n3;
                    n1 = n3;
                    n2 = sum1;
                    n3 = sum2;
                }
            }

            if (n%2 == 0) {
                System.out.println(sum1);
            }
            else {
                System.out.println(sum2);
            }

        }




    }

}