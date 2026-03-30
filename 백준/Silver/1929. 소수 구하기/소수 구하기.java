
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int m = sc.nextInt();

          loop1 : for (int i=n; i<=m; i++) {
              if (i == 2 || i == 3) {
                  System.out.println(i);
                  continue;
              }
              for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i %j == 0) {
                        continue loop1;
                    }
                    if (j == (int) Math.sqrt(i)) {
                        System.out.println(i);
                    }
                }
            }







        }
    }
}