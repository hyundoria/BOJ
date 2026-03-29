

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int n = Math.min(a.length(), b.length());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {


            int k = (Integer.parseInt((a.substring(a.length()-i-1,a.length()-i))) + Integer.parseInt((b.substring(b.length()-i-1,b.length()-i))));

            if (k >= 10) {
                StringBuilder sbr = new StringBuilder();
                sbr.append(k);
                sb.append(sbr.reverse());
            }
            else {
                sb.append(k);
            }

        }

        StringBuilder stb = new StringBuilder();

        if (a.length() > b.length()) {
            stb.append(a.substring(0,a.length()-n));
            sb.append(stb.reverse());
        }
        else if (a.length() < b.length()) {
            stb.append(b.substring(0,b.length()-n));
            sb.append(stb.reverse());
        }


        System.out.println(sb.reverse());





    }
}
