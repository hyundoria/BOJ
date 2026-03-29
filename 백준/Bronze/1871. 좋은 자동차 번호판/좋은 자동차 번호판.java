

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();

        for (int r = 0; r < t; r++) {

            String str = sc.next();

            String stt = str.substring(0, 3);

            int n = Integer.parseInt(str.substring(4));

            int sum = 0;

            for (int i = 0; i < stt.length(); i++) {

                sum += (stt.charAt(i) - 65) * (Math.pow(26, stt.length() - i - 1));

            }

            if (Math.abs(n - sum) <= 100) {
                System.out.println("nice");
            } else {
                System.out.println("not nice");
            }

        }



    }
}
