

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        for (int i=0; i<n; i++) {

            StringBuilder sb = new StringBuilder();
            String str = sc.nextLine();

            char ch = str.charAt(0);

            if (ch > 96) {
                sb.append( (char) (str.charAt(0) - 32));
                sb.append(str.substring(1));
                System.out.println(sb);
            }
            else {
                System.out.println(str);
            }

        }

    }
}
