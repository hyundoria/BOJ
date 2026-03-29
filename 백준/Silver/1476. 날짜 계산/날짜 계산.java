

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();


        for (int i=1; i<=7980; i++) {

            int ee = i%15;
            int ss = i%28;
            int mm = i%19;

            if (ee == 0) {
                ee = 15;
            }
            if (ss == 0) {
                ss = 28;
            }
            if (mm == 0) {
                mm = 19;
            }

            if (ee == e && ss == s && mm == m) {
                System.out.println(i);
                break;
            }


        }

    }
}