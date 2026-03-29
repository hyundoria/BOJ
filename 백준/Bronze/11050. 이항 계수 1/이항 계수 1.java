
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = n-k;

        int nn = 1;
        int kk = 1;
        int tt = 1;


        for (int i=1; i<=n; i++) {
            nn = i*nn;
        }

        for (int i=1; i<=k; i++) {
            kk = i*kk;
        }

        for (int i=t; i>0; i--) {
            tt = i*tt;
        }

        System.out.println(nn/(kk*tt));

    }
}