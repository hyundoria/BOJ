

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String n = sc.next();

            if (n.equals("0")) {
                break;
            }

            int sum = 0;

            for (int i=0; i<n.length(); i++) {

                if (n.charAt(i) == '0') {
                    sum += 4;
                }
                else if (n.charAt(i) == '1') {
                    sum += 2;
                }
                else {
                    sum += 3;
                }
            }

            sum += n.length() + 1;

            System.out.println(sum);


        }



    }
}



