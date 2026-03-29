
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        loop1 : for (int i=0; i<n; i++) {

            String str = sc.next();

            int cnt = 0;

            if (str.charAt(0) == ')') {
                System.out.println("NO");
                continue;
            }
            else {
                cnt++;
            }

            for (int j=1; j<str.length(); j++) {


                char ch = str.charAt(j);

                if (ch  == '(') {
                    if (str.charAt(j-1) == ')' && cnt < 0) {
                        System.out.println("NO");
                        continue loop1;

                    }

                    cnt ++;
                }

                if (ch == ')') {
                    if (cnt <= 0) {
                        System.out.println("NO");
                        continue loop1;
                    }
                    else {
                        cnt--;
                    }
                }



            }

            if (cnt == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }


        }


    }
}



