

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);
            char ck;

            if (ch >= 'a' && ch <= 'z') {

                ck = (char) (ch + 13);

                if (ck > 'z') {
                    ck = (char) (ck - 26);
                }

                sb.append(ck);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                ck = (char) (ch + 13);

                if (ck > 'Z') {
                    ck = (char) (ck - 26);
                }
                sb.append(ck);
            }
            else {
                sb.append(ch);
            }

        }

        System.out.println(sb);




    }
}



