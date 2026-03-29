

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        for (int i=0; i<6; i++) {

            String str = sc.next();

            if (str.charAt(0) == 'W') {
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("-1");
        }
        else if (cnt < 3) {
            System.out.println("3");
        }
        else if (cnt < 5) {
            System.out.println("2");
        }
        else if (cnt < 7) {
            System.out.println("1");
        }

    }
}