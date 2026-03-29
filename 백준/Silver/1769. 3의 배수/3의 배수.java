

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int cnt = 0;

        while (str.length() != 1) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += Integer.parseInt(str.substring(i,i+1));
            }
            str = String.valueOf(sum);
            cnt++;
        }

        System.out.println(cnt);
        if (Integer.parseInt(str)%3 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }




    }

}