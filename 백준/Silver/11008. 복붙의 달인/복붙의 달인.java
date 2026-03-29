

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        for (int j=0; j<n; j++) {

            String str = sc.next();
            String p = sc.next();

            StringBuilder sb = new StringBuilder();

            int cnt = 0;

            for (int i = 0; i < str.length(); i++) {

                if (p.length() >= str.length() - i + 1) {
                    sb.append(str.substring(i));
                    break;
                }

                if (str.substring(i, i + p.length()).equals(p)) {
                    cnt++;
                    i += p.length() - 1;
                } else {
                    sb.append(str.charAt(i));
                }

            }

            cnt += sb.length();

            System.out.println(cnt);

        }


    }
}



