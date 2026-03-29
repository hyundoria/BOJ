

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String str = sc.next();

        int sum = 0;

        for (int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a') {
                sum += ch - 96;
            }
            else if (ch <= 'Z'){
                sum += ch - 65 + 27;
            }

        }

        if (prnum(sum)) {
         System.out.println("It is a prime word.");
        }
        else {
            System.out.println("It is not a prime word.");
        }



    }

    static boolean prnum(int a) {

        boolean ck = false;

        if (a == 1) {
            return true;
        }
        if (a == 2 || a == 3) {
            return true;
        }

        for (int j = 2; j <= Math.sqrt(a); j++) {
            if (a % j == 0) {
                ck = false;
                break;
            }
            if (j == (int) Math.sqrt(a)) {
                ck = true;
            }
        }

        return ck;
    }




}
