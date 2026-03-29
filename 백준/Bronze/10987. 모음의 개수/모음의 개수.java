

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int cnt = 0;

        for (int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a') {
                cnt++;
            }
            else if (ch == 'e') {
                cnt++;
            }
            else if (ch == 'i') {
                cnt++;
            }
            else if (ch == 'o') {
                cnt++;
            }
            else if (ch == 'u') {
                cnt++;
            }


        }

        System.out.println(cnt);


    }
}
