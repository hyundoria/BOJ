
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

           int n = sc.nextInt();

           int cnt = 1;

          int k = n-1;


           for (int i=1; i<=n/6; i++) {

               if (k - (i*6) > 0) {
                    k -= i*6;
                    cnt++;
               }

           }

           if (k > 0) {
               cnt++;
           }

           System.out.println(cnt);


        }
    }
}