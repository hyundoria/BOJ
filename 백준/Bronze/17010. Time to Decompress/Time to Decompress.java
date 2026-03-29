

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int k = sc.nextInt();
            String str = sc.next();
            StringBuilder sb = new StringBuilder();

            for (int j=0; j<k; j++) {
                sb.append(str);
            }

            System.out.println(sb);

        }



    }
}

