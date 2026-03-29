

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dpa = new int[46];
        int[] dpb = new int[46];

        dpa[0] = dpb[0] = dpa[1]=0;
        dpb[1] = 1;

        for (int i=2; i<=n; i++) {
            dpa[i] = dpb[i-1];
            dpb[i] = dpa[i-1] + dpb[i-1];
        }


        System.out.println(dpa[n] + " " + dpb[n]);


    }

}