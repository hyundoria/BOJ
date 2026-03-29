

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int t = sc.nextInt();

            int c = 0;
            float g = 0;

            for (int j=0; j<t; j++) {
                int a = sc.nextInt();
                c += a;
                float b = sc.nextFloat();
                g += a*b;
            }

            System.out.println(c +" "+Math.round((g/c)*10)/10.0);


        }





    }
}