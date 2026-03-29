

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            ch = (char) (ch-3);

            if (ch < 'A') {
                ch = (char) (ch + 26);
            }


            sb.append(ch);


        }

        System.out.println(sb);



    }
}
