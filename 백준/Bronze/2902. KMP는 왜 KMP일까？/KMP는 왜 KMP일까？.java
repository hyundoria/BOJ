

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {

            if (str.charAt(i) <= 'Z' && str.charAt(i) != '-') {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);





















    }

}

