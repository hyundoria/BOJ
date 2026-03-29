

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int n = sc.nextInt();

        loop1 :while (true) {

            if (n == 1) {
                n++;
                continue;
            }

            if (n == 2 || n == 3) {
                System.out.println(n);
                break;
            }

            for (int j = 2; j <= Math.sqrt(n); j++) {


                if (n % j == 0) {
                    n++;
                    continue loop1;
                }

                if (j == (int) Math.sqrt(n)) {

                    String str = Integer.toString(n);
                    StringBuilder sb = new StringBuilder();

                    for (int i=str.length()-1; i>=0; i--) {
                        sb.append(str.charAt(i));
                    }

                    int k = Integer.parseInt(String.valueOf(sb));

                    if (n == k) {
                        System.out.println(n);
                        break loop1;
                    }
                    else {
                        n++;
                    }





                    }
                }
            }





    }
}



