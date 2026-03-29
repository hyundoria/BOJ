

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int t = (int) Math.sqrt(Math.pow(w,2) + Math.pow(h,2));

        for (int i=0; i<n; i++) {

            int k = sc.nextInt();

            if (k <= t) {
                System.out.println("DA");
            }
            else {
                System.out.println("NE");
            }


        }


    }
}
