

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        String dd = String.valueOf(d);

        int cnt = 0;

        loop1 : for (int i=n; i<=m; i++) {
            if (i == 2 || i == 3) {
                if (d == i) {
                    cnt++;
                }
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i %j == 0) {
                    continue loop1;
                }
                if (j == (int) Math.sqrt(i)) {
                    String str = String.valueOf(i);
                    for (int r=0; r<str.length(); r++) {
                        if (str.substring(r,r+1).equals(dd)) {
                            cnt++;
                            continue loop1;
                        }
                    }
                }



            }
        }

        System.out.println(cnt);

    }
}
