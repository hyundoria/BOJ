

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String str = sc.nextLine();

            int up = 0;
            int low = 0;
            int space = 0;
            int num = 0;


            for (int i=0; i<str.length(); i++) {

                if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                    num++;
                }
                else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                    low++;
                }
                else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                    up++;
                }
                else {
                    space++;
                }



            }

            System.out.println(low + " " + up + " " + num + " " + space);





        }



    }
}
