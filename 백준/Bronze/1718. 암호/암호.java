

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String cipher = sc.next();
        int cnt = 0;

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {

            if (cnt >= cipher.length()) {
                cnt = 0;
            }

            char ch = str.charAt(i);

            if (ch == ' ') {
                sb.append(" ");
                cnt++;
                continue;
            }

            char ci = (char) (cipher.charAt(cnt) - 'a');

            char res = (char) (ch - ci - 1);

            if (res < 'a') {
                res += 26;
            }

            sb.append(res);
            cnt++;
        }

        System.out.println(sb);

    }
}



