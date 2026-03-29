
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;
        int min = 0;

        loop1 : for (int i=n; i<=m; i++) {
            if (i == 2 || i == 3) {
                sum += i;
                continue;
            }
            for (int j=2; j<Math.sqrt(i); j++) {
                if (i%j == 0) {
                    continue loop1;
                }
                if (j == (int)Math.sqrt(i)) {
                    sum += i;
                }
            }
        }


        if(sum == 0) {
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
            loop1 : for (int i=n; i<=m; i++) {
                if (i == 2 || i == 3) {
                    min = i;
                    break;
                }
                for (int j=2; j<Math.sqrt(i); j++) {
                    if (i%j == 0) {
                        continue loop1;
                    }
                    if (j == (int)Math.sqrt(i)) {
                        min = i;
                        break loop1;
                    }
                }
            }
            System.out.println(min);
        }

    }
}