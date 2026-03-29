

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int aa = a*B + A*b;
        int bb = b*B;

        int gcd = gcd(aa,bb);

        System.out.println(aa/gcd+ " " + bb/gcd);






    }
    public static int gcd(int a, int b) {
        if (a%b == 0) {
            return b;
        }
        return gcd(b,a%b);

    }

}