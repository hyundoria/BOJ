
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int start = 666;
        int count = 0;


        while (true) {

            boolean ck = false;

            String str = String.valueOf(start);
            int ckk = 0;
            int cnt = 0;


            for (int i=0; i<str.length(); i++) {

                if (str.charAt(i) == '6') {
                    cnt++;

                    if (ck) {
                        ckk++;
                    }

                    ck = true;
                }
                else {
                    ck = false;
                    if (ckk < 2) {
                        ckk = 0;
                    }
                 }
            }

            if (cnt >= 3 && ckk >= 2) {
                count++;
            }

            if (count == n) {
                System.out.println(start);
                break;
            }

            start++;

        }





    }
}



