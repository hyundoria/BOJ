

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int j=0; j<3; j++) {

            String str = sc.next();

            int cnt = 1;
            int max = 1;
            boolean ck = false;

            for (int i = 0; i < 7; i++) {

                if (str.charAt(i) == str.charAt(i + 1)) {
                    ck = true;
                    cnt++;
                }
                else {

                    if (cnt >= max) {
                        max = cnt;
                    }
                    cnt = 1;
                }

            }

            System.out.println(Math.max(max,cnt));
        }


    }
}
